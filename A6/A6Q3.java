//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 3
 * Write a program to increment the value of one variable by one and 
 * display it after one second using thread using sleep() method.
 */
public class A6Q3 {
	public static void main(String[] args) {
		int count = 0; 
		try { 
			for (int i = 0; i < 10; i++) { 
				Thread.sleep(1000); //sleep for 1000 ms = 1sec
				count++; 
				System.out.println("Counter after one second is :" + count); 
			} 
		} catch (Exception e) { 
			System.out.println("Interrupted Exception is occurred " + e); 
		} 
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
