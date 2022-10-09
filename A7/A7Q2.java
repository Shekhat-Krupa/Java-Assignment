//Created by Shekhat Krupa (21CE133)
/*
* Practical 2
* Write a program that counts the occurrences of words in a text and displays the words 
* and their occurrences in alphabetical order of the words. Using Map and Set Classes
*/
import java.io.*;
import java.util.*;
public class A7Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        File file = new File(scanner.next());
        if (!file.isFile()) {
            System.out.println(file + " is not a file.");
        }
        String[] words;
        try {
        	BufferedReader in = new BufferedReader(new FileReader(file));
            StringBuilder buffer = new StringBuilder(10000);
            String s;
            while ((s = in.readLine()) != null)
                buffer.append(s).append("\n");

            words = buffer.toString().split("[0-9]+|\\W+");


        } catch (Exception ex) {
            words = new String[1];
            System.out.println("Error opening file...");
            System.exit(0);
        }

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<String, Integer>();
        
        for (String word1 : words) {
            String key = word1;

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        System.out.println("Words\t\tcount");   
        System.out.println("________________________");   
        for(Map.Entry<String, Integer> entry:map.entrySet()){    
            String key=entry.getKey();  
            Integer b=entry.getValue();  
            System.out.println(key+"\t\t"+b);   
        }
        System.out.println("\nBy Shekhat Krupa 21CE133");
	}
}
