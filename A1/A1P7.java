//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 7
 *  Display numbers in a pyramid pattern.
                 1
               1 2 1
             1 2 4 2 1
           1 2 4 8 4 2 1
         1 2 4 8 16 8 4 2 1
      1 2 4 8 16 32 16 8 4 2 1
   1 2 4 8 16 32 64 32 16 8 4 2 1
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 */
import java.util.Scanner;
public class A1P7 {//Assignment 1st Practical 7th
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the no of lines in pyramid : ");
        int size = sc.nextInt();
        L7 p = new L7();
        p.pyramid(size);
        System.out.println("By Shekhat Krupa 21CE133");
        sc.close();
    }
}
