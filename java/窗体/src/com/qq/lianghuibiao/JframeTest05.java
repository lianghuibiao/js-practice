package com.qq.lianghuibiao;
/*
 * 
 * 窗体练习第五个版本 
 * 完成功能篇
 *    窗口排版
 * 
 * 
 * */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class JframeTest05 extends JFrame {
	
		
		static JPanel  jp=new JPanel(); 
		static JButton btn=new JButton();	
		static JButton btn2=new JButton();	
		static TextField textField=new TextField(20);
		
		static TextField textField1=new TextField(20);
		static TextField textField2=new TextField(20);
		static TextField textField3=new TextField(20);
	    static TextField tf1 = new TextField(20);
	//封装窗体
		private void jf(int width,int hight) {
			// TODO Auto-generated method stub
		    //设置窗体可见
		    setVisible(true);
		     //s设置窗体的大小
		    setSize(width, hight);
		     //设置背景颜色
		    setBackground(Color.red);
		    //设置窗口居于屏幕的什么位置
		    setLocation(300,200);
		    //设置窗口的标题
		    setTitle("窗体练习");
		}
//封装文本输入框 

		private static TextField text(TextField textField,int len) {	
			 textField.setVisible(true);
			 textField.setLocation(350,350);
			textField.setColumns(len);
			
			 textField.setBounds(100, 100, 200,60);
					 return textField;
		}
		

	
	//封装jpanel
		private static JPanel jPanel(JPanel jp,int width,int hight) {
			  jp.setLayout(new BorderLayout());//比如BorderLayout
		       jp.setVisible(true);
		       jp.setSize(width, hight);
		       jp.setBackground(Color.cyan);
		       jp.add(btn(btn,"按钮",600,100),BorderLayout.EAST);
		       jp.add(btn(btn2,"按钮2",600,100),BorderLayout.WEST);
		       jp.add(text(textField, 20));
		        jp.add(text(tf1, 20));
		       
		        jp.add(textField,BorderLayout.SOUTH);
		        jp.add(tf1,BorderLayout.NORTH);
		       return jp;
		}
		
	//封装button
		private static JButton btn(JButton btn,String name,int width,int height) {  
		       btn.setVisible(true);
		       btn.setSize(width, height);
		       btn.setBackground(Color.YELLOW);
		       btn.setText(name);
		  
		       addActionListener(btn);
		       //绑定监听事件
		   	
		      
		       return btn;
		}
		private static void addActionListener(JButton btn) {
			 btn.addActionListener(new ActionListener() {	   	
			   		@Override
			   		public void actionPerformed(ActionEvent e) {
			   	tf1.setText(textField.getText());
			   		}
			   	});
		}

			public static void main(String[] args) {
				int  width=900;
				int height=600;
		        JframeTest05 f1=new JframeTest05();
		       f1.jf(width,height);
		       //添加到窗体中
		    
		       f1.add(jPanel(jp,width,height));
		  //  System.out.println(textField.getText());
			}
}
