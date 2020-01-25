package com.qq.lianghuibiao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("--Client--");
	    Socket client =new Socket("localhost",8888);
	   //2.客户端发送消息
	    BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
	    String msg =console.readLine();
	    DataOutputStream dos=new DataOutputStream(client.getOutputStream());
	    dos.writeUTF(msg);
	    dos.flush();
	     //3.获取消息
	    DataInputStream dis=new DataInputStream(client.getInputStream());
	    msg=dis.readUTF();
	    System.out.println(msg);
	    
	    //释放资源
	    dos.close();
	    dis.close();
	    client.close();
	}

}
