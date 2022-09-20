//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 3
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of ClassCastException.
 */
public class P4Q1_3_ClassCastException {
	public static void main(String[] args) {
		System.out.println("It is an example of ClassCastException."); 
		try {
	           
            // creating an object
            Object o = new Object();
           
            // type casting the object o to string which
            // give the classcasted exception because we
            // type cast an parent type to its child type.
            String s = (String)o;
           
            System.out.println(s);
        }
        catch (ClassCastException e) {
            System.out.println("Cought : "+e);
        }
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
