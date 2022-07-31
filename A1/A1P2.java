//Created by Shekhat Krupa (21CE133)
/*  Practical : 2
	 * Given a string, return a string made of the first 2 chars (if present), however include 
	first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
	yields "oz".
	startOz("ozymandias") → "oz"
	startOz("bzoo") → "z"
	startOz("oxx") → "o"
 */
import java.util.Scanner;
public class A1P2 {//Assignment 1st Practical 2nd
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        System.out.print("Enter Number Of strings:");
        t = sc.nextInt();// for multiple inputs 
        while (t-- > 0) {
            String str;
            System.out.print("Enter a String :");
            str = sc.next();
            L2 f = new L2();
            System.out.print("startOz(\""+str+"\") --> ");
            f.findOZ(str);

        }
        System.out.println("By Shekhat Krupa 21CE133");
        sc.close();
    }
}
