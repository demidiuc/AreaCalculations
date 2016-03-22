package simple_geom_figures;
import geom_figures_interface.GeometicFiguresCalculation;

/**
 * Created by Serg on 15.03.2016.
 */

public class Trapezoid implements GeometicFiguresCalculation {
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

    public  Trapezoid(double sideA, double sideB, double sideC, double sideD) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.sideD=sideD;

    }


    public double calcPerimeter() {
        return sideA+sideB+sideC+sideD ;
    }
}
