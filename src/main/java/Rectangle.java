/**
 * Created by Serg on 08.03.2016.
 */
public class Rectangle {
    //S=a*b
    private double sideA;
    private double sideB;

    Rectangle(double x, double y) {
        this.sideA=x;
        this.sideB=y;
    }

    public double calcArea() {
        return sideA*sideB;
    }
}
