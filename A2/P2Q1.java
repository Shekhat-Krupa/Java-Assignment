//Created by Shekhat Krupa (21CE133)
/*
 * Practical 1
 * Design a class named Cylinder containing following attributes and behavior.
	● One double data field named radius. The default value is 1.
	● One double data field named height. The default value is 1.
	● A no-argument constructor that creates a default Cylinder.
	● A Single argument constructor that creates a Cylinder with the specified radius.
	● Two argument constructor that creates a Cylinder with the specified radius and 
		height.
	● A method named getArea() that returns area of the Cylinder.
	● Create a class TestCylinder and test and display result
 */

//package Part2;

public class P2Q1 {
	
	public static void main(String args[]) {
		Cylinder c = new Cylinder();
		Cylinder c1 = new Cylinder(4);
		Cylinder c2 = new Cylinder(5,7);
		float a,a1,a2;
		a=c.getArea();
		a1=c1.getArea();
		a2=c2.getArea();
		System.out.println("Area with default constructor : "+a);
		System.out.println("Area with one parameterized constructor : "+a1);
		System.out.println("Area with two parameterized constructor : "+a2);
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
