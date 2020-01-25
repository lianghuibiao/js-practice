package com.qq.lianghuibiaoxxx;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class ChatServer {
    public static void main(String[] args) {
    	   System.out.println("--server--");
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader in = null;
        try {
        	while (true) {
        		server = new ServerSocket(8888);
                socket = server.accept();
                //创建向客户端发送消息的线程，并启动
                new ServerThread(socket).start();
		   
              
     
            // main线程负责读取客户端发来的信息
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = in.readLine();
                System.out.println("客户端说：" + str);
            }
        } 
        }
        	catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
            	//非空判断
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
 
/**
 * 专门向客户端发送消息的线程
 * 
 * @author Administrator
 *
 */
class ServerThread extends Thread {
    Socket ss;
    BufferedWriter out;
    BufferedReader br;
 
    public ServerThread(Socket ss) {
        this.ss = ss;
        try {
        	
            out = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 //重写run
    public void run() {
        try {
            while (true) {
            	//服务器端读写
                String str2 = br.readLine();
                out.write(str2 + "\n");
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(out != null){
                out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}