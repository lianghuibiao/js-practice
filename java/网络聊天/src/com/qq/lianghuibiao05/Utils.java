package com.qq.lianghuibiao05;

import java.io.Closeable;

//工具类释放资源
public class Utils {
   public static void close(Closeable... targets) {
	for(Closeable target:targets) {
		try {
			if (null==target) {
				target.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}
