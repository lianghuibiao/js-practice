package test01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class network {
    // 练习-判断本网段有多少可用的ip地址
    // 首先获取 获取本机IP地址
    // 再通过使用java 执行ping命令 判断这些ip地址能否使用,把能够使用的ip打印出来
 
    // 使用java自带的线程池
    static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>());
    // 创建一个线程安全的集合,用来存放可以连接的ip地址
    static List<String> IPName = Collections.synchronizedList(new ArrayList<String>());
 
    public static void main(String[] args) {
    //起始地址
    	
        String startIP = localIP().substring(0, 2);
        System.out.println("起始地址: " + startIP);
 
        testIP(startIP);
 
        threadPoolIsShutDown();
    }
 
    // 获取本机IP地址
    public static String localIP() {
        String ip = null;
        try {
            InetAddress host = InetAddress.getLocalHost();
            ip = host.getHostAddress();
            System.out.println("本机IP地址: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip;
    }
 
    // 判断传入IP是否可以连接的方法
    public static boolean isUsableIP(String ip) {
 
        StringBuffer sb = new StringBuffer();
        String line = null;
 
        try {
            Process p = Runtime.getRuntime().exec("ping -n 1 " + ip);
 
            // 缓存流必须建立在一个已存在的流的基础上
            InputStreamReader isr = new InputStreamReader(p.getInputStream(), "GBK");
            BufferedReader br = new BufferedReader(isr);
 
            while ((line = br.readLine()) != null) {
                if (line.length() != 0) {
                    sb.append(line + "\r\n");
                }
            }
            // 关闭流
            br.close();
            isr.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        // 如果字符串内含"TTL",说明IP连接成功
        if (sb.toString().contains("TTL")) {
            return true;
        } else {
            return false;
        }
    }
 
    // 将本网段的IP地址遍历
    public static void testIP(String startIP) {
        // 创建一个原子类,用来统计已经结束的线程总数
        AtomicInteger atomicValue = new AtomicInteger();
 
        for (int i = 0; i < 255; i++) {
            // markIP的范围为192.168.X.1 到 192.168.X.255
            String markIP = startIP + (i + 1);
 
            // 添加线程进入线程池
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    boolean useableIP = isUsableIP(markIP);
                    if (useableIP) {
                        // 将可以连接的IP地址添加到集合种
                        IPName.add(markIP);
                        System.out.println("找到可连接的ip地址：" + markIP);
                    }
                    // 原子数递增
                    // int number = atomicValue.incrementAndGet();
                    synchronized (atomicValue) {
                        System.out.println("已经完成:" + atomicValue.incrementAndGet() + " 个 ip 测试");
                    }
                }
            });
        }
    }
 
    // 判断线程是否全部结束
    private static void threadPoolIsShutDown() {
        threadPool.shutdown();
        while (true) {
            if (threadPool.isTerminated()) {
                System.out.println("如下ip地址可以连接");
                for (String IP : IPName) {
                    System.out.println(IP);
                }
                System.out.println("总共有: " + IPName.size() + " 个可用地址");
                break;
            }
        }
//      if (threadPool.awaitTermination(1, TimeUnit.HOURS)) {
//            System.out.println("如下ip地址可以连接");
//            for (String IP : ips) {
//                System.out.println(IP);
//            }
//            System.out.println("总共有: " + IPName.size() + " 个可用地址");
//        }
    }
}