package com.qq.lianghuibiao;
/*
 * 
 * 窗体练习第三个版本 
 * 优化与封装
 * 
 * 
 * 

 * 
 * 
 * */

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JframeTest03 extends JFrame {

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
    setLocation(300,300);
    //设置窗口的标题
    setTitle("窗体练习");
}
static String text="你好";

	//绑定事件
	private static void addActionListener(JButton btn) {
		 btn.addActionListener(new ActionListener() {
		   		
		   		@Override
		   		public void actionPerformed(ActionEvent e) {
		   			// TODO Auto-generated method stub
		   			JOptionPane.showMessageDialog(null, "保存成功");
		   			btn.setText(text);
		   			text="aaa";
		   		}
		   	});
	}

	//封装jpanel
		private static JPanel jPanel(int width,int hight) {
			JPanel jp=new JPanel();
		       jp.setVisible(true);
		       jp.setSize(width, hight);
		       jp.setBackground(Color.cyan);
		       jp.add(btn("按钮",100,100));
		       jp.add(buildJLabel(text,200, 100, 200, 100) );
		       jp.add(text(text));
		       return jp;
		}
	//封装文本输入框 
	//问题  监听事件过后并没有刷新原本的内容   怎么回事？
		
	private static TextField text(String text) {
		 TextField textField=new TextField();
		 textField.setVisible(true);
		 textField.setSize(300,300);
		 textField.setText(text);
		 return textField;
	}
	//封装button
	private static JButton btn(String name,int width,int height) {
		 JButton btn=new JButton(name);	
	       btn.setVisible(true);
	       btn.setSize(width, height);
	       btn.setBackground(Color.YELLOW);
	       addActionListener(btn);
	       //绑定监听事件
	      
	      
	       return btn;
	}
	//添加一个文本框
	private static JLabel buildJLabel(String name, int x, int y, int width, int height) {
        JLabel label = new JLabel(name);
        label.setBounds(x, y, width, height);
        return label;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  width=900;
		int height=700;
       JframeTest03 f1=new JframeTest03();
       f1.jf(width,height);
       //添加到窗体中
   
       f1.add(jPanel(width,height));
    
   
	}

}
