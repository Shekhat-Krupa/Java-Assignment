
public class ComparableSquare extends Squre_for_pr10 {
    protected double side2;
 
    public double getside2() {
        return side2;
    }
 
    public void setside2(double side2) {
        this.side2 = side2;
    }
 
    public void area2() {
        System.out.println();
        System.out.println("The ColorableSquare Area : ");
        System.out.println("The area of square is : " + this.side2 * this.side2);
    }
}
