package javaType;

import java.util.Scanner;

public class TypeTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("你这次考试考了多少分？");
		//输入你的成绩信息
		float chengji=sc.nextFloat();
		//条件语句   你考试考的怎么样？
		//符号 &&表示的是且  ||表示的是或
		//如果成绩大于等于0 而且  成绩少于60
		//考试成绩不及格  输出
	    if (chengji>=0&&chengji<60) {
			System.out.println("成绩不及格，你这小子咋不用功点咧～");	
		}
	    //如果成绩大于等于60 而且 成绩小于等于80
	    //你的成绩及格了  输出
	    else if(chengji>=60&&chengji<=80){
	    	System.out.println("你的成绩及格了！");
	    }
	    //如果成绩大于80 而且 成绩小于等于90  
	    //你的成绩很棒了  输出
	    else if (chengji>80&&chengji<=90) {
	    
			System.out.println("你的成绩很棒了！");
		}
	    //如果成绩大于90 而且 成绩小于等于100
	    //你的成绩超级好  输出
	    else if (chengji>90&&chengji<=100) {
			System.out.println("你的成绩超级好，来当程序员吧！");
		} 
	    //排除了上面的任何一个条件 输入信息不合法
	    else {
			System.out.println("您输入的成绩信息不合法");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	   /* for(int i=1;i<=a;i++) {
	    	for(int j=1;j<=i;j++) {

	    		String str;
	    		
	    		str=i+"*"+j+"="+i*j;
	    		
	    		
					System.out.print(str+"\t");
				
	    		
	    		
	    	}
	    System.out.println("\n");
	    }*/
	  /*  //无限循环
	    while(true) {
			 System.out.println("aa");
		 }*/
	}
	 
	
	
	
	
	//System.out.println(d);
	

 
}

//double的范围为-2^1024 ~ +2^1024，也即-1.79E+308 ~ +1.79E+308。