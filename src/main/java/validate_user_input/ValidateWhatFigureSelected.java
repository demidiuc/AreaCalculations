package validate_user_input;

//Подключеить Scanner
import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class ValidateWhatFigureSelected {

    public static int validateUserInput(){
        //Создаем новый объект класса Scanner
        Scanner scanner = new Scanner(System.in); //System.in - Стандартный поток ввода (клавиатура) в Java
        Integer choise = null; //Переменная которая будет хранить выбор,  сделанный пользователем

        System.out.println("1. Треугольние\n" +
                "2. Прямоугольник\n" +
                "3. Круг\n");
        System.out.println("Выберите фигуру:\n");

        String inputText = scanner.nextLine();

//      Проверяем является ли введенный символ числом
        try{
            choise = Integer.parseInt(inputText);
        }
        catch (NumberFormatException e){
            System.out.println("Err: Введенный символ не является целым числом\n");
//            return validateUserInput();
            choise = validateUserInput();
        }

        return choise;

    }

    public static String selectFigure() {
        String figure = null;

        boolean run = true;

        while (run!=false) {
            int a = validateUserInput();
            if (a == 1) {
                run = false;
                figure = "Треугольник";
                break;
            }

            if (a == 2) {
                run = false;
                figure = "Прямоугольник";
                break;
            }

            if (a == 3) {
                run = false;
                figure = "Круг";
                break;
            }

            else{
                System.out.println("Совпадений не найдено.\n");
            }
        }
        return figure;
    }

    public static double calcAreaSelectedFigure(){
        Double area = null;
        String selfigure = selectFigure();

        if(selfigure == "Треугольник"){
            area = 10.0;
        }

        if(selfigure == "Прямоугольник"){
            area = 20.0;
        }

        if(selfigure == "Круг"){
            area = 30.0;
        }

        return area;
    }

    public static void main(String[] args) {
        //int a = validateUserInput();
        System.out.println(calcAreaSelectedFigure());
    }

}