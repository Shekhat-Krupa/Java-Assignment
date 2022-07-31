//Created by Shekhat Krupa (21CE133)
/*  Practical : 3
	Given two non-negative int values, return true if they have the same last digit, such 
	as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
	10 is 7.
	lastDigit(7, 17) → true
	lastDigit(6, 17) → false
	lastDigit(3, 113) → true
 * */
// Solution :
import java.util.Scanner;//importing Scanner class 
public class A1P3 {//Assignment 1st Practical 3rd
	public static void main(String argc[]) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n1=sc.nextInt();
		System.out.println("Enter the checking last digit : ");
		n2=sc.nextInt();
		L3 a = new L3();
		if(a.lastDigit(n1,n2)) {
			System.out.println("lastdigit(" + n1 + ", " +n2+ ") --> true" );
		}
		else {
			System.out.println("lastdigit(" + n1 + ", " +n2+ ") --> false" );
		}
		System.out.println("By Shekhat Krupa 21CE133");
		sc.close();
	}
}
