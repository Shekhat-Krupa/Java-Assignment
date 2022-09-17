//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 6
 * Write a program that demonstrates use of packages & import statements.
 */
package A3Q6.package1;
import A3.P3Q6_1;// importing the java file from package A3
public class P3Q6_2 {
	public static void main(String []a) {
		/*as I have imported the P3Q6_1 file which is not present in this package 
		 * now I can make object of that file.
		 */
		P3Q6_1 obj = new P3Q6_1();
		obj.show();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
