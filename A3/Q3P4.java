//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 4
 * Develop a Program that illustrate method overriding concept. 
 */
package A3;
import java.util.Scanner;
class base
{
	public base() {
	}
	public void show(){//method of parent class
		System.out.println("This is parent Class.");
	}
}
class child extends base
{
	public child(){
	}
	public void show(){//overriding the method of parent class
		super.show();
		System.out.println("This is child Class.");
	}
}
public class Q3P4 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		child obj = new child();
		obj.show();//it will show first parent method and after that will show child method
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
