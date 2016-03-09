/**
 * Created by Serg on 08.03.2016.
 */
public class Triangle {
    //S=1/2*b*h
    private double side;
    private double height;

    public Triangle(double x, double y) {
        side=x;
        height=y;
    }

    public double triangleArea() {
        return (side*height)/2;
    }
}
