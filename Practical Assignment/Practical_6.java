//Created by Shekhat Krupa (21CE133)
/*
* Practical 6
* Design a class named Triangle that extends GeometricObject.
∙ The class contains: Three double data fields named side1, side2, and side3
with default values 1.0 to denote three sides of a triangle.
∙ A no-arg constructor that creates a default triangle.
∙ A constructor that creates a triangle with the specified side1, side2, and side3.
∙ The accessor methods for all three data fields.
∙ A method named getArea() that returns the area of this triangle.
∙ A method named getPerimeter() that returns the perimeter of this triangle.
∙ A method named toString() that returns a string description for the triangle.
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " +side3.

*/
public class Practical_6 {
    public static void main(String[] args) {
        new Triangle();
        new Triangle(15, 20, 25);
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
