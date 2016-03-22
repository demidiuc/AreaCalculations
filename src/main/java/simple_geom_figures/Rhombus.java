package simple_geom_figures;
import geom_figures_interface.GeometicFiguresCalculation;

/**
 * Created by Serg on 15.03.2016.
 */
public class Rhombus implements GeometicFiguresCalculation {
    double diagonalP;
    double diagonalQ;
    double sideA;

    public Rhombus(double p,double q) {
        this.diagonalP=p;
        this.diagonalQ=q;
    }

    public double calcArea() {
        return (diagonalP*diagonalQ)/2;
    }

    public Rhombus(double x) {
        this.sideA=x;
    }

    public double calcPerimeter() {
        return 4*sideA;
    }
}
