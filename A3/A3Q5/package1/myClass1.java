//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 5
 * Write a java program which shows importing of classes from other user define packages.
 */
package A3.A3Q5.package1;

public class myClass1 {
	private void pri(){
		System.out.println("This is private method in myClass1");
	}
	protected void pro(){
		System.out.println("This is protected method in myClass1");
	}
	public void pub(){
		System.out.println("This is public method in myClass1");
	}
	void def(){
		System.out.println("This is default method in myClass1");
	}
	public static void main(String []a) {
		myClass1 obj = new myClass1();
		//every type of method is allowed in same class
		obj.pri();
		obj.pro();
		obj.pub();
		obj.def();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
