package com.qq.lianghuibiao;
/*
 * 
 * 窗体练习第二个版本 
 * JButton 类的使用 以及功能的实现
 * 
 * 
 * 

 * 
 * 
 * */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JframeTest01 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JframeTest01 f1=new JframeTest01();
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
       
       //实例化一个JButton
       JButton btn=new JButton("按钮");
       btn.setVisible(true);
       btn.setSize(100, 100);
       btn.setBackground(Color.YELLOW);
       
       //添加到jpanel中
       jp.add(btn);
       
      //绑定监听事件
       btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "保存成功");
		}
	});
	}

}
