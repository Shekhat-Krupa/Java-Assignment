//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 1
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of ArithmeticException.
 */
public class P4Q1_1 {
	//
	public static void main(String[] args) {
		System.out.println("It is an example of ArithmeticException."); 
		try  
		{  
		// performing division and storing the result  
			int a=10, b=0;
			int res = a / b;  
			System.out.println("Division process has been done successfully.");  
			System.out.println("Result came after division is: " + res);  
		}  
		// handling the exception in the catch block  
		catch(java.lang.ArithmeticException ex)  
		{  
			System.out.println("Should avoid dividing by 0 " + ex);  
		}  
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
