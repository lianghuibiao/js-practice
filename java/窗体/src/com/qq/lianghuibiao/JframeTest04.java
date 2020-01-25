package com.qq.lianghuibiao;
/*
 * 
 * 窗体练习第四个版本 
 * 完成功能篇
 * 1.输入框输入什么 点击按钮就回应什么
 * 
 * 2.处理空指针异常

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

public class JframeTest04 extends JFrame {
	
		
		static JPanel  jp=new JPanel(); 
		static JButton btn=new JButton();	
		static TextField textField=new TextField(20);
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
			 textField.setSize(500,500);
			 textField.setLocation(350,350);
			textField.setColumns(len);
					
					 return textField;
		}
		

	
	//封装jpanel
		private static JPanel jPanel(JPanel jp,int width,int hight) {
		
			
		       jp.setVisible(true);
		       jp.setSize(width, hight);
		       jp.setBackground(Color.cyan);
		       jp.add(btn(btn,"按钮",200,100));
		       jp.add(text(textField, 20));
		        jp.add(text(tf1, 20));
		     
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
	/*//添加一个文本框
	private static JLabel buildJLabel(String name, int x, int y, int width, int height) {
        JLabel label = new JLabel(name);
        label.setBounds(x, y, width, height);
        return label;
    }
	*/
	//绑定事件
	
		private static void addActionListener(JButton btn) {
			 btn.addActionListener(new ActionListener() {
			   	
			   		@Override
			   		public void actionPerformed(ActionEvent e) {
			   			// TODO Auto-generated method stub
			   			//System.out.println("aaa"+text);
			   	
			   			
			   		//JOptionPane.showMessageDialog(null,textField.getText());
			   	tf1.setText(textField.getText());
			   		}
			   	});
		}

	public static void main(String[] args) {
		int  width=900;
		int height=600;
       JframeTest04 f1=new JframeTest04();
       f1.jf(width,height);
       //添加到窗体中
    
       f1.add(jPanel(jp,width,height));
  //  System.out.println(textField.getText());
	}
   
       
       
	

}
