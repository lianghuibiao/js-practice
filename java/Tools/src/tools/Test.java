package tools;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.soap.Text;

public class Test extends JFrame {
 /*
 * 那个 Jframe 窗体写框架  
 * 
 * 
 * 
 * 
 * 
 * */
	static int winX=600;
	static int winY=400;
	public void  Jframe() {
		 setVisible(true);
		 setSize(winX, winY);
		 setLocation(500,300);
		 setTitle("可视化窗体");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test test =new Test();
       test.Jframe();
       
       JPanel jPanel =new JPanel();
       jPanel.setVisible(true);
       jPanel.setSize(winX,winY);
      test.add(jPanel);
     /*  JButton jButton=new JButton();
       jButton.setVisible(true);
       jButton.setSize(80, 80);
       jButton.setBackground(Color.yellow);
      jPanel.add(jButton);*/
      
      
    	  bt bt1=new bt(100,100);
    	  bt bt2=new bt(100,100);
    	 
    	  
    	  
    	  jPanel.add(bt1);
    	  jPanel.add(bt2);
      
      
	}

}
//创建按钮类  参数  X y  大小
class bt extends JButton{
	public bt(int btnX,int btnY) {
		
		setVisible(true);
		setSize(btnX,btnY);
		setBackground(Color.yellow);
		setText("按钮");
	
	}

}


