//Created by Shekhat Krupa (21CE133)
/*
* Practical 2
* In an n-sided regular polygon, all sides have the same length and all angles have the  same degree (i.e., the polygon is both equilateral and equiangular). Design a class  named RegularPolygon that contains:  
* A private int data field named n that defines the number of sides in the  polygon with default value 3. \
* A private double data field named side that stores the length of the side with  default value 1. 
* A private double data field named x that defines the x-coordinate of the  polygon’s center with default value 0. 
* A private double data field named y that defines the y-coordinate of the  polygon’s center with default value 0. 
* A no-arg constructor that creates a regular polygon with default values.  
* A constructor that creates a regular polygon with the specified number of sides  and length of side, centered at (0, 0).
* A constructor that creates a regular polygon with the specified number of  sides, length of side, and x- and y-coordinates. 
* The accessor and mutator methods for all data fields. 
* The method getPerimeter() that returns the perimeter of the polygon.
* The method getArea() that returns the area of the polygon.
*/
class Practical_2 {
	public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.setNos(5);
        r.getNos();
        r.setlos(10.00);
        r.getlos();
        r.setx(7.00);
        r.getx();
        r.sety(8.00);
        r.gety();
        System.out.println("The Perimeter of given Input is : " + r.getPerimeter());
        System.out.println("The Area of given Input is : " + r.getArea());
        System.out.println("By Shekhat Krupa 21CE133");
    }
}
