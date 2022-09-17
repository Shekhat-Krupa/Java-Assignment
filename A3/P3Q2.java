//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 3
 * Write a program to create a default method in an interface IPrinter. Create an interface IPrinter 
 * and IScanner. You can assume variables and methods for both interfaces. Create a concrete class 
 * to implement both the interfaces. Create 5 objects of the class, store it in Vector and display 
 * the result of the vector.
 */
package A3;
import java.util.*;
public class P3Q2 {
	public static void main(String s[]) {
		concrete[] obj = new concrete[5];
		for(int i=0; i<5; i++){
			obj[i]=new concrete();
		}
		for(int i=0; i<5; i++){
			obj[i].setName();
			obj[i].setmarks();
		}
		obj[0].display();
		System.out.println("Name\tmarks");
		for (int i=0; i<5; i++) {
			obj[i].displayName();
			obj[i].displaymarks();
		}
		System.out.println("After adding objects into the vector,");
		Vector<concrete> c = new Vector<concrete>();
		for(int i=0; i<5; i++){
			c.add(obj[i]);
		}
		System.out.println(c);
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
