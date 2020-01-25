package com.qq.lianghuibiao02;

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
 * 实现一个客户可以正常手法信息  收发多条消息
 * 其他客户必须等到关闭才能
 * 
 * 
 * */
public class Chat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       System.out.println("--server--");
      
       //指定一个端口  使用serversocket 创建服务器
       ServerSocket server=new ServerSocket(8888);
       
       // main线程负责接收服务器发来的信息
       //阻塞连接 等待链接accept
       while (true) {
    	
	
       Socket client =server.accept();
       System.out.println("一个客户端建立了链接");
       new Thread(()->{
    	 //3.操作 输入输出流操作
           //接受消息
           DataInputStream dis=null;
           DataOutputStream dos=null;
		try {
			dis = new DataInputStream(client.getInputStream());
			 dos=new DataOutputStream(client.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //服务器说话 
	
	boolean isrun=true;

   	    while (isrun) {
   	    	String msg;
			try {
				msg = dis.readUTF();
				   dos.writeUTF(msg);
				 
		   	         dos.flush();
		   	       System.out.println("客户端说："+msg);
		   	         
			} catch (IOException e) {
				// TODO Auto-generated catch block
				isrun=false;
				 
				e.printStackTrace();
			}
			
			
			try {
				String msg1 = "";
				dos.writeUTF(msg1);
				dos.flush();
				System.out.println(msg1);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("---4-------");
		
			}
   	      
   		}
   	   //释放资源
        try {
        	if (null==dos) {
				dos.close();
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		 try {
			 if (null==dis) {
					dis.close();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       try {
	    		 if (null==client) {
	    			 client.close();
					}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       }).start();
       }
	}
	}

