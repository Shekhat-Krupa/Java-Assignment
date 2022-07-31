//Created by Shekhat Krupa (21CE133)
/* Practical : 5
 * Given 2 strings, a and b, return the number of the positions where they contain the 
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
and "az" substrings appear in the same place in both strings.
	stringMatch("xxcaazz", "xxbaaz") → 3
	stringMatch("abc", "abc") → 2
	stringMatch("abc", "axc") → 0
 */
import java.util.Scanner;
public class A1P5 {//Assignment 1st Practical 5th
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String a, b;
        System.out.print("Enter the first String : ");
        a = sc.next();
        System.out.print("Enter the second String : ");
        b = sc.next();

        L5 s = new L5();
        System.out.println("stringMatch(\"" + a + "\", \"" + b + "\") --> " +s.stringMatch(a, b));
        System.out.println("By Shekhat Krupa 21CE133");
        sc.close();
        
    }
}
