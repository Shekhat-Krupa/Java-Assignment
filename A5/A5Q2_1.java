//Created by Shekhat Krupa (21CE133)
/*
* Practical 2
* When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give an example.
*/
import java.io.*;
public class A5Q2_1 {
	 public static void main(String[] args) throws IOException {
	        FileReader source = null;
	        try {
	            source = new
	                    FileReader("F:\\A5\\src\\A5Q2.txt");
	            int temp;
	            while ((temp = source.read()) != -1)
	                System.out.print((char) temp);
	        }
	        finally {
	            if (source != null)
	                source.close();
	        }
	        System.out.println("By Shekhat Krupa 21CE133");   
	    }
}
