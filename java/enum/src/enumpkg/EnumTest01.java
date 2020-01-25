package enumpkg;

import java.util.Enumeration;
import java.util.Vector;

public class EnumTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//可以美剧一次获得一个对象的集合中的元素
		
      Enumeration<String> days;
      Vector<String> dayNames=new Vector<String>();
      dayNames.add("aaa");
      dayNames.add("bbb");
      dayNames.add("ccc");
      dayNames.add("ddd");
      dayNames.add("eee");
      dayNames.add("fff");
      dayNames.add("ggg");
      days=dayNames.elements();
      while (days.hasMoreElements()) {
    	  //
	System.out.println(days.nextElement());
	//测试此枚举是否包含更多元素 读道没有就返回false
	System.out.println(days.hasMoreElements());
		
	}
      
	}

}
