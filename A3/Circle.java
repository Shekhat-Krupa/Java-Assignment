package A3;
public class Circle extends GeometricObject {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius ,String color,boolean filled) {
		this.radius = radius;
		this.color=color;
		this.filled=filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	void getArea() {
		System.out.println("The area of circle is: " +(double)Math.PI*radius*radius);
	}
	void getPerimeter() {
		System.out.println("The Perimeter of circle is: " +(double)2*Math.PI*radius );
	}
}
