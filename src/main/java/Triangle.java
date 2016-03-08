/**
 * Created by Serg on 08.03.2016.
 */
public class Triangle {
    //S=1/2*b*h
    double side;
    double height;

    Triangle(double x, double y) {
        side=x;
        height=y;
    }

    double triangleArea() {
        return (side*height)/2;
    }
}
