/**
 * Created by Serg on 08.03.2016.
 */
public class Triangle implements FirstInterface {
    //S=1/2*b*h
    private double sideA;
    private double sideB;
    private  double sideC;
    private double height;

    public Triangle(double x, double y) {
        this.sideA=x;
        this.height=y;
    }

    public Triangle(double a, double b, double c) {
        this.sideA=a;
        this.sideB=b;
        this.sideC=c;
    }


    public double calcArea() {
        return (sideA*height)/2;
    }

    public double calcPerimeter(){
        return sideA+sideB+sideC;
    }
}
