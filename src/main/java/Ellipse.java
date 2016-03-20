/**
 * Created by Serg on 15.03.2016.
 */
public class Ellipse implements GeometicFiguresCalculation {
    double axisA;
    double axisB;

    public Ellipse(double x, double y) {
        this.axisA=x;
        this.axisB=y;
    }

    public double calcArea() {
        return Math.PI*axisA*axisB;
    }

    public double calcPerimeter() {

        return 4 * (Math.PI * axisA * axisB + Math.pow(axisA - axisB, 2)) / (axisA + axisB);
    }
}
