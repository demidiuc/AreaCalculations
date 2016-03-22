package simple_geom_figures;
import geom_figures_interface.GeometicFiguresCalculation;

/**
 * Created by Serg on 09.03.2016.
 */
public class Square implements GeometicFiguresCalculation {
    //S=pow(side, 2)
    private double sideA;

    public Square(double x) {
        this.sideA=x;
    }

    public double calcArea() {
        return Math.pow(sideA, 2);
    }

    public double calcPerimeter() {
        return 4*sideA;
    }
}
