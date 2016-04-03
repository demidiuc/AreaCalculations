package validate_user_input;
import simple_geom_figures.Triangle;

import java.util.Scanner;
import java.util.IllegalFormatConversionException;

public class ValidateDataForGeomFigures {
    public static double userInputValidation() {
        Scanner scanner = new Scanner(System.in);
        Double dataFromUser = null;

        String inputText = scanner.nextLine();

        try{
            dataFromUser = Double.parseDouble(inputText);
        }

        catch (NumberFormatException e){
            System.out.println("Введенный символ не может быть конвертирован в формат double.");
            return userInputValidation();
        }

        return dataFromUser;
    }

//
public static void main(String[] args) {

    System.out.println("Введите три стороны треугольника и высоту:\n");

    double sideA = userInputValidation();
    double sideB = userInputValidation();
    double sideC = userInputValidation();
    double height = userInputValidation();
//    Triangle Area
    Triangle triangle = new Triangle(sideA, height);
//    Triangle Perimeter
    Triangle trianglePerimeter = new Triangle(sideA,sideB,sideC);

    System.out.println("Площадь треугольника: ");
    System.out.println(triangle.calcArea());

    System.out.printf("Периметр треугольника: ");
    System.out.println(trianglePerimeter.calcPerimeter());
}
}

