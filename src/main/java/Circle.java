/**
 * Created by Serg on 08.03.2016.
 */

public class Circle implements GeometicFiguresCalculation {
    //S=pi*r*r
    //Math.PI
    private double radius;

    public Circle(double x) {
        this.radius=x;
    }

    public double calcArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }
}
