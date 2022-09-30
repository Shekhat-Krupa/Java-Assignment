//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 4
 * Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. 
 * Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 
 * 5(default) and the ‘THIRD’ thread to 7.
 */
class MyThread extends Thread 
{ 
	public void run() 
	{ 
		System.out.print(Thread.currentThread().getName()); 
		System.out.println(" Priority is "+Thread.currentThread().getPriority()); 
	} 
} 

public class A6Q4 {
	public static void main(String[] args) throws InterruptedException {
		MyThread FIRST = new MyThread(); 
		MyThread SECOND = new MyThread(); 
		MyThread THIRD = new MyThread(); 
		FIRST.setPriority(3); //set priority as 3
		SECOND.setPriority(5);//set priority as 5 
		THIRD.setPriority(7); //set priority as 7
		FIRST.start(); 
		FIRST.join(); 
		SECOND.start(); 
		SECOND.join(); 
		THIRD.start(); 
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
