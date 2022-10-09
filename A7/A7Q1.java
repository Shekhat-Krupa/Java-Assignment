//Created by Shekhat Krupa (21CE133)
/*
* Practical 1
* Create a generic method for sorting an array of Comparable objects
*/

import java.util.Arrays;
public class A7Q1 {
	public static void main(String[] args) {

			GenericSortComparable<Integer> obj = new GenericSortComparable();

			System.out.println("For Numbers :-");
			  Integer arryList[] = {1,46,65,74,72,99,8,133};
			  System.out.println("Before sorting the arry : ");
			  GenericSortComparable.printArray(arryList);
			  obj.sort(arryList, arryList.length);
			  System.out.println("After sorting the arry : ");
			  GenericSortComparable.printArray(arryList);
			 
			  System.out.println("\nFor minimum maximum :-");
			  System.out.println("Printing the maximum value : ");
			  System.out.print(GenericSortComparable.maximum(12, 273, 283));
			
			  System.out.println("\nPrinting the minimum value : ");
			  System.out.print(GenericSortComparable.minimum(12, 273, 283));
			  
			  String sample[] = {"Krupa","Priyanshi","Rutvi","Abhi","Niral"};
			  System.out.println("\n\nFor Words :-");
			  System.out.println("Before sorting the arry : ");
			  obj.printArray(sample); 
			  Arrays.sort(sample);
			  System.out.println("After sorting the arry : ");
			  obj.printArray(sample);

		System.out.println("\nBy Shekhat Krupa 21CE133");
	}
}
