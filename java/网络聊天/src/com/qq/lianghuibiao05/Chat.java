package com.qq.lianghuibiao05;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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
    
       //阻塞连接 等待链接accept
       while (true) {
       Socket client =server.accept();
       System.out.println("一个客户端建立了链接");
    
       new Thread(new Channel(client)).start();
     
       }
	}
	
	
	
	
	//静态内部类  一个客户代表一个channel
static class Channel implements Runnable{
   private DataInputStream dis;
   private DataOutputStream dos;
   private Socket client;
   private boolean isrun=true;
   //构造器
   public Channel(Socket client) {
	   this.client=client;
	   try {
			 dis= new DataInputStream(client.getInputStream());
			 dos=new DataOutputStream(client.getOutputStream());
			 isrun=true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("------------1-----------");
			release();
		}
	// TODO Auto-generated constructor stub
	   
}
   
   
 //接收消息
   private String receive() {
   	String msg = "";
   	try {
   		msg=dis.readUTF();
   	  System.out.println("客户端说："+msg);
   	} catch (IOException e) {
   		// TODO Auto-generated catch block
   		isrun=false;
   		System.out.println("---4-------");
   		
   		release();
   	
   	}
   	return msg;
   }
   
   
   
   public void run() {
		
		while (isrun) {
			 String msg=receive();
			if(!msg.equals("")){
				send(msg);
				
			}
			
			
		}
	}
	//发送消息
	private void send(String msg) {
		try {
			dos.writeUTF(msg);

			 dos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("---5-------");
		  release();
		}
	}
	//释放资源
	private void release() {
    this.isrun=false;
    Utils.close(dis,dos,client);
	}
	
}
}
