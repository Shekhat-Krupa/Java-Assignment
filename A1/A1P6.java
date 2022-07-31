//Created by Shekhat Krupa (21CE133)
/*
 *  Given an array of strings, return a new array without the strings that are equal to 
the target string. One approach is to count the occurrences of the target string, make 
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

 */
import java.util.Scanner;
public class A1P6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int a = sc.nextInt();
        
        String[] b = new String[a];
        System.out.print("Enter array : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        
        System.out.print("Enter string you want to remove : ");
        String c = sc.next();
        
        L6 l =new L6();
        l.wordsWithout(b, c);
        System.out.println("\nBy Shekhat Krupa 21CE133");
        sc.close();
    }
   
}