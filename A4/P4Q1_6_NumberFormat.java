

//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 5
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of NumberFormatException.
 */
import java.io.FileNotFoundException;
public class P4Q1_6_NumberFormat {
	public static void main(String[] args) {
		System.out.println("It is an example of NumberFormatException.");
		 try {
	            // "krupa" is not a number
	            int num = Integer.parseInt ("krupa") ;
	 
	            System.out.println(num);
	    }
		catch (NumberFormatException e) {
	           System.out.println("Caught : " + e);
	        }
			System.out.println("By Shekhat Krupa 21CE133");
	}
}
