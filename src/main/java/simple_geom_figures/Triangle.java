package simple_geom_figures;
import geom_figures_interface.GeometicFiguresCalculation;

/**
 * Created by Serg on 08.03.2016.
 */
public class Triangle implements GeometicFiguresCalculation {
    //S=1/2*b*h
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    /*public Triangle(double x, double y) {
        this.sideA=x;
        this.height=y;
    }*/

    public Triangle(double x, double h) {
        this.sideA=x;
        this.height=h;
    }

    public Triangle(double x, double y, double z) {
        this.sideA=x;
        this.sideB=y;
        this.sideC=z;
    }


    public double calcArea() {
        return (sideA*height)/2;
    }

    public double calcPerimeter(){
        return sideA+sideB+sideC;
    }
}
