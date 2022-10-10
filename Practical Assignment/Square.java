
public class Square extends GeometricObject_for_P9 {
    private double side1 = 0;
 
    Square() {
        System.out.println("The Default Squre is :");
        System.out.println("The area of square is : " + side1 * side1);
        System.out.println();
    }
 
    public double getside1() {
        return side1;
    }
 
    public void setside1(double side1) {
        this.side1 = side1;
    }
 
    public void area() {
        System.out.println("The Squre Successfully Created!!!!");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}
