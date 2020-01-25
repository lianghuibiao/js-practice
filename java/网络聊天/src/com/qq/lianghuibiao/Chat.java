package com.qq.lianghuibiao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 * 
 * 在线聊天室
 * 实现一个客户可以正常手法信息
 * 
 * 
 * */
public class Chat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       System.out.println("--server--");
       //指定一个端口  使用serversocket 创建服务器
       ServerSocket server=new ServerSocket(8888);
         
       //阻塞连接 等待链接accept
       Socket client =server.accept();
       System.out.println("一个客户端建立了链接");
       //3.操作 输入输出流操作
         //接受消息
         DataInputStream dis=new DataInputStream(client.getInputStream());
         String msg=dis.readUTF();
        //返回消息
         DataOutputStream dos=new DataOutputStream(client.getOutputStream());
         dos.writeUTF(msg);
         //释放资源
         dos.close();
       dis.close();
       client.close();
	}

}

