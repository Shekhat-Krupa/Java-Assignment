package A3;
import java.util.Scanner;
public class Rectangle extends GeometricObject{
	Scanner sc = new Scanner(System.in);
	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		width = 0;
		height = 0;
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.filled = filled;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
	return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	void getArea() {
		System.out.println("The area of rectangle is: " + (double)height * width);
	}
	void getPerimeter() {
		System.out.println("The Perimeter of rectangle is: " + (double)(2 * (height + width)));
	}

}
