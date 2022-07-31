//Created by Shekhat Krupa (21CE133)
/* Practical : 4
 	Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
	array somewhere.
	array123([1, 1, 2, 3, 1]) → true
	array123([1, 1, 2, 4, 1]) → false
	array123([1, 1, 2, 1, 2, 3]) → true
 * 
 */
import java.util.Scanner;
public class A1P4 {//Assignment 1st Practical 4th
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size of an array : ");
        n = sc.nextInt();
        System.out.print("Enter elements of the array : ");
        int []a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        L4 l=new L4();
        if(l.sequence(a))
        	System.out.println("Sequence of 1 , 2 , 3 is in the array.");
        else 
        	System.out.println("Sequence of 1 , 2 , 3 is NOT in the array.");
        System.out.println("By Shekhat Krupa 21CE133");
        sc.close();
    }
}
