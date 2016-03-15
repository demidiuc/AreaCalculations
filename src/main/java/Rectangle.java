/**
 * Created by Serg on 08.03.2016.
 */
public class Rectangle implements FirstInterface {
    //S=a*b
    private double sideA;
    private double sideB;

    public Rectangle(double x, double y) {
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double calcArea() {
        return sideA*sideB;
    }

    public double calcPerimeter() {
        return 2*sideA+2*sideB;
    }
}
