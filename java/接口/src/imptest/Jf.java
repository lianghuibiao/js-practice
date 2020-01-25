package imptest;

import javax.swing.JFrame;

public class Jf extends JFrame implements JpanelTest,JbuttonTest,Jfile {
//不用设置jpanel的大小都能铺满
	
	
	//定义两个接口  一个是jpanel 一个btn  利用两个接口的创建进行学习
	/*通过JFrame 窗体来认识接口
	 * 
	 * 我学到了什么？
	 * 接口可以有多个  但是 只能继承一个类  使用接口的方式 大大的降低了开发的难度
	 * 接口包括着一个类  
	 * 跟继承一样  也要实例化对象才可以使用
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Jf f=new Jf();
			f.setVisible(true);
			f.setSize(800,500);
			f.setLocation(300, 200);
			jp j =new jp();
			f.add(j);
			btn btn=new btn();
			j.add(btn);
			jfe jfc=new jfe();
			j.add(jfc);
	}

}
