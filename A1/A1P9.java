//Created by Shekhat Krupa (21CE133)
/* Practical : 9
 * The problem is to check whether a given Sudoku solution is correct.
 */
import java.util.Scanner;
public class A1P9 {//Assignment 1st Practical 9th
	public static void main(String argc[]) {
		
		Scanner sc = new Scanner (System.in);
		int arr[][]=new int[9][9];
		System.out.println("Enter the Solution of sudoku : ");
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int row[]=new int [9];
		int column[]=new int [9];
		int sumRow=0,sumColumn=0;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				row[i]+=arr[i][j];
			}
			if(row[i]==45) {
				sumRow+=row[i];
			}
			else {
				System.out.println("Not a solution");
				break;
			}
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				column[i]+=arr[j][i];
			}
			if(column[i]==45){
				sumColumn+=row[i];
			}
			else {
				System.out.println("Not a solution");
				break;
			}
		}
		
		if(sumRow+sumColumn==810) {
			System.out.println("It is correct solution");
		}
		System.out.println("By Shekhat Krupa 21CE133");
		sc.close();
		
	}
}
