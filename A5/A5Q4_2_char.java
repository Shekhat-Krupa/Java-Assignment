//Created by Shekhat Krupa (21CE133)
/*
* Practical 4
*  WAP to show use of character and byte stream. 
*  for character stream 
*/
import java.io.*;
public class A5Q4_2_char {
	public static void main(String[] args) throws IOException{
	    FileReader in = null;
	    FileWriter out = null;
	    // Reading source file using read method 
	    // and write to file using write method
	    try {
	        in = new FileReader("A5Q2.txt");
	        out = new FileWriter("file2.txt");
	        int c;
	        while ((c = in.read()) != -1) {
	            out.write(c);
	        }
	    }finally {
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
