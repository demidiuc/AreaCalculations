/**
 * Created by Serg on 09.03.2016.
 */
public class Square {
    //S=pow(side, 2)
    private double sideA;

    Square(double x) {
        this.sideA=x;
    }

    public double calcArea() {
        return Math.pow(sideA, 2);
    }
}
