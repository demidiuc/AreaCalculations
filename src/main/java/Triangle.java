/**
 * Created by Serg on 08.03.2016.
 */
public class Triangle {
    //S=1/2*b*h
    private double side;
    private double height;

    public Triangle(double x, double y) {
        this.side=x;
        this.height=y;
    }

    public double calcArea() {
        return (side*height)/2;
    }
}
