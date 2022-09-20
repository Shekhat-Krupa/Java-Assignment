//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 4
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of IndexOutOfBoundsException.
 */
public class P4Q1_4_IndexOutOfBounds {
	public static void main(String[] args) {
		System.out.println("It is an example of IndexOutOfBoundsException."); 
		int ar[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= ar.length; i++)//array length is 5 so index will go till 0 to 4
                System.out.print(ar[i]+" ");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Caught"+e);
        }
        System.out.println("By Shekhat Krupa 21CE133");
	}
}
