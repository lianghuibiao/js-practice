package testGeneric;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyCollection<String> myCollection=new MyCollection<String>();
    myCollection.set("小李", 0);
    myCollection.set("小黑", 1);
   
   // Integer a=(Integer)myCollection.get(1);
    String b=(String)myCollection.get(0);
    String c=(String)myCollection.get(1);
    System.out.println(b);
    System.out.println(c);
	}

}
//泛型容器  E代表着类型
class MyCollection<E>{
	Object[] objs= new Object[5];
	public void set(E e,int index) {
		objs[index]=e;
		
	}
	public E get(int index) {
		return (E)objs[index];
	}
	
}
