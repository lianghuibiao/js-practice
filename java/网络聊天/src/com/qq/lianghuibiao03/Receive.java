package com.qq.lianghuibiao03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/*
 *接收端
 * 
 * 使用多线程封装了接收端
 * 
 * 
 * */




public class Receive implements Runnable {
	
	private DataInputStream dis;
	private Socket client;
	private boolean isrun;
	
public Receive(Socket client) {
	this.client=client;
	try {
		dis=new DataInputStream(client.getInputStream());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("=========21=========");
		release();
	
	}
}
//接收消息
private String receive() {
	String msg="";
	try {
		msg=dis.readUTF();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("--8----");
	release();
	}
	return msg;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		  while (isrun) {
			String msg=receive();
			if (!msg.equals("")) {
			System.out.println(msg);
			}
			
		}
	}
	//释放资源
	private void release() {
	 this.isrun=false;
		 Utils.close(dis,client);
	}
}
