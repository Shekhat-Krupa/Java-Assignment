//Created by Shekhat Krupa (21CE133)
/*
* Practical 4
*  WAP to show use of character and byte stream.
*  for byte stream 
*/
import java.io.*;
public class A5Q4_1_byte {
	public static void main(String[] args) throws IOException{
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try {
            sourceStream = new FileInputStream("F:\\A5\\src\\A5Q2.txt");
            targetStream = new FileOutputStream ("F:\\A5\\src\\A5Q1.txt");
            // Reading source file using read method 
            // and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }finally {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
