//Created by Shekhat Krupa (21CE133)
/*
 * Practical : 1
 * Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject 
 * models common features of geometric objects. Both Circle and Rectangle contain the getArea() and 
 * getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you 
 * can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter()
 * methods in the GeometricObject class. Give implementation in the specific type of geometric object. 
 * CreateTestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area 
 * of both and display results. Design of all classes are given in the following UML diagram. 
 */
package A3;
import java.util.Scanner;
public class P3Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GeometricObject g1 = new Circle(5);
		g1.getArea();
		g1.getPerimeter();
		GeometricObject g2 = new Rectangle(3, 6);
		g2.getArea();
		g2.getPerimeter();
		sc.close();
		System.out.println("By Shekhat Krupa 21CE133");
	}
}
