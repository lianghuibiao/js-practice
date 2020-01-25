package test01;

import java.net.InetAddress;
import java.net.UnknownHostException;
 //查看本机的IP地址
public class Test01 {
 
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
}