/**
 * Created by Serg on 15.03.2016.
 */

public class Trapezoid implements FirstInterface {
    double sideA;
    double sideB;
    double sideC;
    double sideD;
    double height;

    public Trapezoid(double a, double b, double h) {
        this.sideA=a;
        this.sideB=b;
        this.height=h;
    }

    public double calcArea() {
        return ((sideA+sideB)*height)/2;
    }

    public double calcAreaAlt() {
        Triangle tr = new Triangle(5, 5);
        return 0;
    }

    public double calcPerimeter() {
        return 0;
    }
}
