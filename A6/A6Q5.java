//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 5
 * Write a program to solve producer-consumer problem using thread Synchronization
 */
public class A6Q5 {
	public static void main(String[] args) {
		Producer p = new Producer(); 
		//Consumer c = new Consumer(p); 
		p.start(); 
		//c.start();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}