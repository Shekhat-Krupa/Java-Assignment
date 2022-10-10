//Created by Shekhat Krupa (21CE133)
/*
* Practical 9
* Design an interface named Colorable with a void method named howToColor().  
* Every class of a colorable object must implement the Colorable interface. 
* Design a  class named Square that extends GeometricObject and implements Colorable.  
* Implement howToColor to display the message Color on all four sides. 
* The Square class contains a data field side with getter and setter methods, and a constructor for  constructing a Square with a specified side. 
* The Square class has a private double  data field named side with its getter and setter methods. 
* It has a no-arg constructor to  create a Square with side 0, and another constructor that creates a Square with the  specified side 
*/
public class Practical_9 extends GeometricObject {
    public static void main(String[] args) {
        Square s = new Square();
        s.setside1(10);
        s.getside1();
        s.area();
        System.out.println("\nBy Shekhat Krupa 21CE133");
    }
}
