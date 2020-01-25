package com.qq.lianghuibiao;

import java.net.InetSocketAddress;



/*
 * 
 * 
 * 端口
 * 两个字节 0-65535 UDP TCP
 * 同一个协议端口不能相同
 * 方法
 * getHostName()
 * getAddress()
 * getPort()
 * */
public class InetSocketAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetSocketAddress socketAddress=new InetSocketAddress("localhost",8888);
		System.out.println(socketAddress.getHostName());
		System.out.println(socketAddress.getAddress());
		//获取本机地址
		System.out.println(socketAddress.getPort());
		//获取端口
	}

}
