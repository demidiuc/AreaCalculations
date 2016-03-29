import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("1. Triangle\n" +
                "2. Rectangle\n"+
                "Select figure:");
        int figure;// = 0;// = scaner.nextInt();

        //проверка ввода

                if (scaner.hasNextInt()) {
                    figure = scaner.nextInt();
                    System.out.println(figure);
                }
                else {
                System.out.println("Wrong input!");
                }





    }
}
