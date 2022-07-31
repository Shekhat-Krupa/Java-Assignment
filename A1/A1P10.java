//Created by Shekhat Krupa (21CE133)
/*Practical : 10
 * Implement Caesar Cipher. 
 */
import java.util.Scanner;

public class A1P10 {//Assignment 1st Practical 10th
	public static void main(String argc[]) {
			L10 t =new L10();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the text : ");
		 	String text=sc.next();
		 	System.out.print("Enter the shift : ");
		    int s = sc.nextInt();
		    System.out.println("Text : " + text);
		    System.out.println("Shift : " + s);
		    System.out.println("Cipher : " + t.encrypt(text, s));
		    System.out.println("By Shekhat Krupa 21CE133");
		    sc.close();
	}
}
