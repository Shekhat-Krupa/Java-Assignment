//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 3 - 1
 * Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two 
 * exceptions. Each ‘catch’ block handles a different type of exception. For example the 
 * exception could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. 
 * Display a message in the ‘finally’ block
 */
public class P4Q3_1 {
	public static void main(String[] args) {  
		System.out.println("It is an example of multiple catch blocks with a try block.");
		try{    
			int a[]=new int[5];    
			a[5]=9/0;//it will throw Arithmetic Exception 
			//because first it will divide the value and store it in variable 
		}    
		catch(ArithmeticException e){  
		    System.out.println("Arithmetic Exception has been caught." +e);
		}    
		catch(ArrayIndexOutOfBoundsException e){  
			System.out.println("ArrayIndexOutOfBounds Exception has been Caught."+e);  
		}    
		finally{  
			System.out.println("This is finally block.");
		}             
        System.out.println("By Shekhat Krupa 21CE133");  
 }  
}
