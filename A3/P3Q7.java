//Created by Shekhat Krupa (21CE133)
/*
 *  Practical : 7
 * Write a program that illustrates the significance of interface default method.
 */
package A3;
interface A7
{
	public void override();
	default void show(){
		System.out.println("This is class A method show.");
	}
}
class B7 implements A7{
	public void override(){//overriding the method in child class
		System.out.println("This is implemented class B method overrided.");
	}
}

public class P3Q7 {
	public static void main(String []args){
		B7 d1=new B7();
		d1.override();
		d1.show();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
