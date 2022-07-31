//Created by Shekhat Krupa (21CE133)
/*Practical 8
 * The problem is to write a program that will grade multiple-choice tests. Assume 
there are eight students and ten questions, and the answers are stored in a twodimensional array. Each row records a student’s answers to the questions, as 
shown in the following array.
Students’ Answers to the Questions:
0 1 2 3 4 5 6 7 8 9
Student 0 
Student 1 D B A B C A E E A D
Student 2 E D D A C B E E A D
Student 3 C B A E D C E E A D
Student 4 A B D C C D E E A D
Student 5 B B E C C D E E A D
Student 6 B B A C C D E E A D
Student 7 E B E C C D E E A D
The key is stored in a one-dimensional array:
Key to the Questions:
0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
Your program grades the test and displays the result. It compares each student’s 
answers with the key, counts the number of correct answers, and displays it.
 */
import java.util.Scanner;
public class A1P8 {
	public static void main(String args[]) {
		char [][]student=new char[10][10];
		char key[]=new char[]{'D','B','D','C','C','D','A','E','A','D'};
		int score[]=new int[7];
		System.out.println("Enter the marks of students : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			for(int j=0;j<10;j++) {
				student[i][j]=sc.next().charAt(0);
				if(key[j]==student[i][j]) {
					score[i]++;
				}
			}
		}
		for(int j=0;j<7;j++) {
				System.out.println("score of Student["+(j+1)+"] is " +score[j]);
		}
		System.out.println("By Shekhat Krupa 21CE133");
		sc.close();
	}
}
