
class Cylinder{
    private double radius;
    private double height;
    Cylinder(){//default constructor
        radius=1;
        height=1;
    }
    Cylinder(double r1){//parameterized constructor

        radius=r1;
    }
    Cylinder(double r2, double h2){//parameterized constructor with two parameter
        radius=r2;
        height=h2;
    }
    float getArea() {
        float a;
        a=(3.14f*(float)radius)*((2*(float)radius)+(float)height);//the logic to get the area of cylinder
        return a;
    }
}
