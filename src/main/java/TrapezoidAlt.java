/**
 * Created by Serg on 16.03.2016.
 */
public class TrapezoidAlt {
    double sideA;
    double sideB;
    double sideC;
    double sideD;
    double height;

    public  TrapezoidAlt(double sideA, double sideB, double sideC, double sideD, double height) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.sideD=sideD;
        this.height=height;
    }

    public double calcAreaAlt() {
        double cathetusA;
        double cathetusB;

        cathetusA=Math.sqrt(Math.pow(sideC, 2) - Math.pow(height, 2));
        cathetusB=Math.sqrt(Math.pow(sideD, 2) - Math.pow(height, 2));

        Triangle triangleAreaOne = new Triangle(cathetusA, height);
        Triangle triangleAreaTwo = new Triangle(cathetusB, height);
        if (sideA == height) {
            Square rectangleAreaOne = new Square(sideA);
            return triangleAreaOne.calcArea() + triangleAreaTwo.calcArea() + rectangleAreaOne.calcArea();
        }
        else {
            Rectangle rectangleAreaOne = new Rectangle(sideA, height);
            return triangleAreaOne.calcArea() + triangleAreaTwo.calcArea() + rectangleAreaOne.calcArea();
        }

    }

    public static void main(String[] args) {
        TrapezoidAlt test = new TrapezoidAlt(4, 10, 5, 5, 5);
        System.out.println(test.calcAreaAlt());
    }
}

