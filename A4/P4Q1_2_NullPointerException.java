//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 2
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of NullPointerException.
 */
public class P4Q1_2_NullPointerException {
	public static void main(String[] args) {
		System.out.println("It is an example of NullPointerException."); 
		// Initializing String variable with null value
        String ptr = null;
        
        // Checking if ptr.equals null or works fine.
        try
        {             
            if (ptr.equals("krupa"))// This line of code throws NullPointerException
            	// because ptr is null
                System.out.print("Equal string");
            else
                System.out.print("Not equal string");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught"+e);
        }
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
