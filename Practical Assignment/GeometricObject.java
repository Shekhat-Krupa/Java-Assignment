
public class GeometricObject {
    public double side1 = 1, side2 = 1, side3 = 1;
    public double Perimeter = side1 + side2 + side3;
    public double P = Perimeter / 2.00;
    //area of a triangle
    public double Area = Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));
}
