//Created by Shekhat Krupa (21CE133)
/*
* Practical 6
* WAP to demonstrate methods of wrapper class. 
*/
public class A5Q6 {
	public static void main(String[] args) {
        //first method
        System.out.println("Method 1 : ");
        int a = 133;
        Integer obj1 = Integer.valueOf(a);//Integer instance representing a
        Integer obj2 = a;
        System.out.println("Value of int : " + a);
        System.out.println("Value of Integer instance representing a : " + obj1);
        System.out.println("Value of Wrapper class object : " + obj2);

        //second method 
        System.out.println("\nMethod 2 : ");
        Integer obj3 = Integer.valueOf(8);//Integer instance representing 8
        Integer obj4 = obj3;
        Integer obj5 = obj3;
        System.out.println("Value of Integer instance representing a : " + obj3);
        System.out.println("Value of object 4 : " + obj4);
        System.out.println("Value of object 5 : " + obj5);
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
