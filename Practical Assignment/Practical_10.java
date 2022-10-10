//Created by Shekhat Krupa (21CE133)
/*
* Practical 10
* Define a class named ComparableSquare that extends Square and implements  Comparable. 
* Implement the compareTo method to compare the Squares on the basis  of area. 
* Write a test class to find the larger of two instances of  ComparableSquareobjects. 
*/
public class Practical_10 {
    public static void main(String[] args) {
    Compare_for_Pr10 t=new Compare_for_Pr10();
    t.setside1(12);
    t.getside1();
    t.area1();
    t.setside2(12);
    t.getside2();
    t.area2();
    t.comp();
    t.setside1(11);
    t.getside1();
    t.area1();
    t.setside2(12);
    t.getside2();
    t.area2();
    t.comp();
    System.out.println("\nBy Shekhat Krupa 21CE133");
    }
}
