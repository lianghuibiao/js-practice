package com.qq.lianghuibiao03;

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
	   //2.客户端发送消息
	
	    new Thread(new Send(client)).start();
	    new Thread(new Receive(client)).start();
	    
	
	}
	  
		
	
	    
	
	
	}


