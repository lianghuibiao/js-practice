package com.qq.lianghuibiao;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 
 * 
 * 
 * ip :定位一个节点
 * 查看所有端口：netstat -ano
 * 查看指定端口:netstat -aon|findstr"888"
 * 查看指定进程:tasklist|findstr"888"
 * */
public class NetAdderss {
    
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
			InetAddress addr=InetAddress.getLocalHost();
			System.out.println(addr);
			System.out.println(addr.getHostName());
			
			addr=InetAddress.getByName("www.shsxt.com");
			System.out.println(addr.getHostAddress());
			//返回地址  
			System.out.println(addr.getHostName());
			//返回计算机名
	}

}
