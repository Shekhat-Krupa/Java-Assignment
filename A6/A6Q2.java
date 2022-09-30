import java.util.Random;

//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 2
 * Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to 
 * display the numbers stored at odd indexes by thread1 and display numbers stored at even 
 * indexes by thread2. 
 */
public class A6Q2 {
	public static void main(String []args) {
		Random rand = new Random(); 
		int[] arr = new int[15]; 
		for (int j = 0; j < arr.length; j++) { 
			arr[j] = rand.nextInt(100); 
		} 
		for (int i = 0; i < arr.length; i++) { 
			System.out.println("Index" + i + " = " + arr[i]); 
		} 
		P2T1 t1 = new P2T1(arr); 
		P2T2 t2 = new P2T2(arr); 
		t1.run();//for odd entries
		t2.run();//for even entries
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
