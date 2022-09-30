//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1
 * Write a program to create thread which display “Hello World” message. 
 * 		A. by extending Thread class 
 * 		B. by using Runnable interface. 
 */
public class A6Q1 {
	public static void main(String []args) {
		P1A t1 = new P1A(); 
		P1B t2 = new P1B();
		Thread t = new Thread(t2,"Thread2"); 
		t.start(); 
		t1.start(); 
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
