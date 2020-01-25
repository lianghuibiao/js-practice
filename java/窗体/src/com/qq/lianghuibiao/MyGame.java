package com.qq.lianghuibiao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGame extends JFrame {

	//窗体类
	void jf() {
		setVisible(true);
		setSize(800, 500);
		setLocation(300, 200);
	
	}
  public static JPanel jp(JPanel jPanel){
	  jPanel.setSize(800, 500);
	  jPanel.setLayout(null);
	  jPanel.setLocation(0, 0);
	return jPanel;
}
	 
	//btn类
	 public static JButton btn(JButton button) {
		 button.setSize(100,60);
		 button.setBackground(Color.YELLOW);
		 button.setBounds(0, 400, 100, 60);
		 return button;
	 }
	 //键盘监听
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyGame myGame=new MyGame();
		JPanel jPanel =new JPanel();
		JButton button=new JButton("我是人物");
		myGame.jf();
		myGame.add(jp(jPanel));
		jp(jPanel).add(btn(button));
		
	
	}
	

}
