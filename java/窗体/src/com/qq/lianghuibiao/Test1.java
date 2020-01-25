package com.qq.lianghuibiao;
import java.awt.*;
 
import javax.swing.*;
 
import java.awt.event.*;
 
public class Test1 extends JFrame{
 
    MyPanel mp=null;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test1 test1=new Test1();
        
    }
 
    public  Test1(){
         
        mp=new MyPanel();
        Thread panelThread = new Thread(mp);
        panelThread.start();
        this.add(mp);
         
        this.addKeyListener(mp);
         
        this.setSize(800, 500);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     
}
 
class MyPanel extends JPanel implements KeyListener,Runnable
{
    int x=50;
    int y=430;
    //重写paint方法
    public void paint(Graphics g){
         
        super.paint(g);
         
        g.fillOval(x, y, 50, 50);
        //g.drawRect(50, 50, 10,5);
         g.drawRect(200, 390, 50, 50);
        
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("被按下的是"+e.getKeyChar());
          
         
         
    }
    @Override
    public void run(){
        while(true){
            if(y<0)
                y = 0;
            else
                y-=10;
            this.repaint();
            try {
              Thread.sleep(200);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
        }
    }
  
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
    	System.out.println(e.getKeyCode());
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=10;
         
   
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=10;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
             
            x-=10;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
             
            x+=10;
        }
        
        this.repaint();
         
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
         
    }
    public void move() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaa");
	}
     
}
