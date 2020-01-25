package arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Collection<E> 
		 //测试collection 接口中的方法
	  Collection<String> collection  =new ArrayList<>();
	  //返回 多少的元素
	  collection.size();
	
	  System.out.println(collection.isEmpty()); //是否是一个
	  collection.add("ddd");
	  collection.add("猪八戒");
	  collection.remove("ddd");  //移除一个   不是删除 
	  System.out.println(collection.size());  //返回2
	  
	}

}
