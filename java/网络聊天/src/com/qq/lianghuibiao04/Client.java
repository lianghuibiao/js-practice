package com.qq.lianghuibiao04;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
//加入多线程聊天
//使用多线程
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("--Client--");
		 
	    Socket client =new Socket("localhost",8888);
	    BufferedReader in = null;
	     
	       
	   //2.客户端发送消息
	    BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
	    
	    DataOutputStream dos=new DataOutputStream(client.getOutputStream());
	    
	    DataInputStream dis=new DataInputStream(client.getInputStream());
	    boolean isrun=true;
	  
	    while (isrun) {
	        String msg =console.readLine();
		    dos.writeUTF(msg);
		    msg=dis.readUTF();
		    System.out.println(msg);
		    dos.flush();
		}
	
	    
	    //释放资源
	    dos.close();
	    dis.close();
	    client.close();
	}

}
