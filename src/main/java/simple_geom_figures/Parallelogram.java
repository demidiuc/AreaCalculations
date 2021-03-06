package simple_geom_figures;
import geom_figures_interface.GeometicFiguresCalculation;

/**
 * Created by Serg on 15.03.2016.
 */
public class Parallelogram implements GeometicFiguresCalculation {
    double sideA;
    double sideB;
    double height;

    public Parallelogram(double x, double y, double h) {
        this.sideA=x;
        this.sideB=y;
        this.height=h;
    }

    public double calcArea() {
        return sideA*height;
    }

    public double calcPerimeter() {
        return 2*(sideA + sideB);
    }
}
