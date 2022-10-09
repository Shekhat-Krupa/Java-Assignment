//Created by Shekhat Krupa (21CE133)
/*
* Practical 2
* When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give an example.
*/
import java.io.*;
public class A5Q2_2 {
	public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	       // Reading source file using read method 
	        // and write to file using write method
	      try {
	         in = new FileReader("F:\\A5\\src\\A5Q2.txt");
	         out = new FileWriter("F:\\A5\\src\\A5Q1.txt");
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);//writing in file A5Q1 from A5Q2
	         }
	      }
	       finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	      System.out.println("By Shekhat Krupa 21CE133");
	   }
}
