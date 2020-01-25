package com.qq.lianghuibiao;
/*
 * 
 * 窗体练习第一个版本 
 * 
 * 窗体的创建 
 * Jpanel类 的应用
 * 创建窗体部分
 * 首先要继承JFrame 类
 * 第二步：实例化类
 * 第三步：使用JFrame 的内部方法 
 * 

 * 
 * 
 * */

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JframeTest extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JframeTest f1=new JframeTest();
         //设置窗体可见
       f1.setVisible(true);
        //s设置窗体的大小
       f1.setSize(600, 400);
        //设置背景颜色
       f1.setBackground(Color.red);
       //设置窗口居于屏幕的什么位置
       f1.setLocation(300,300);
       //设置窗口的标题
       f1.setTitle("窗体练习");
       
       //实例化一个Jpanel
       JPanel jp=new JPanel();
       jp.setVisible(true);
       jp.setSize(600, 400);
       jp.setBackground(Color.cyan);
       
       //添加到窗体中
       f1.add(jp);
	}

}
