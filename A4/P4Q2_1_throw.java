//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 2 - 1
 * WAP to generate user defined exception using “throw” and “throws” keyword.
 * It is an example of throw keyword
 */
public class P4Q2_1_throw {
	public static void main(String args[]){
		System.out.println("It is an example of user defined exception.");
        try {
            // Throw an object of user defined exception
            throw new MyException("Krupa");
        }
        catch (MyException ex) {
            System.out.println("Caught : " + ex);
            // Print the message from MyException object
        }
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}