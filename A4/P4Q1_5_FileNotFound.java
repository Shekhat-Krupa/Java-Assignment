//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1 - 5
 * WAP to show the try - catch block to catch the different types of exception.
 * It is an example of FileNotFoundException.
 */
import java.io.*;
public class P4Q1_5_FileNotFound {
	public static void main(String[] args) {
		System.out.println("It is an example of FileNotFoundException.");
		try {
			 
            // Following file does not exist
            File file = new File("F://file.txt");
 
            FileReader fr = new FileReader(file);
        } 
		catch (FileNotFoundException e) {
           System.out.println("Caught : " + e);
        }
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
