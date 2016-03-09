/**
 * Created by Serg on 08.03.2016.
 */

public class Circle {
    //S=pi*r*r
    //Math.PI
    private double radius;

    Circle(double x) {
        this.radius=x;
    }

    public double calcArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
