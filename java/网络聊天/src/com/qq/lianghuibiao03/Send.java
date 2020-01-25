package com.qq.lianghuibiao03;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 
 * 
 * 发送端
 * 
 * 
 * 
 * */
public class Send implements Runnable {
	private BufferedReader console;
	private DataOutputStream dos;
	private Socket client;
	private boolean isrun;
public Send(Socket client) throws IOException {
	   this.client=client;
	   console=new BufferedReader(new InputStreamReader(System.in));
	 
	   try {
		   
		dos=new DataOutputStream(client.getOutputStream());
		  isrun=true;
		  
		    while (isrun) {
		        String msg =console.readLine();
			    dos.writeUTF(msg);
			   
			    dos.flush();
			}
	//	dos.flush();
		 
	} catch (IOException e) {
		
		System.out.println("====1=====");
		this.release();
		
	}
	
}
//释放资源
private void release() {
 this.isrun=false;
	 Utils.close(dos,client);
}

//从控制台获取消息
private String getStrFromConsole() {
	try {
		return console.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "";
}
@Override
public void run() {
	// TODO Auto-generated method stub
	 while (isrun) {
	String msg=getStrFromConsole();
	if (!msg.equals("")) {
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
				System.out.println("===3==");
			   release();
			}
		}

	
}
