import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        //Спосіб 1
        int a1 = 6;
        int b1 = 4;
        System.out.println(a1 + b1);
        System.out.println(a1 - b1);
        System.out.println(a1 / b1); //Ціла частина від ділення
        System.out.println(a1 * b1);

        //Споc іб 2
        Integer a2 = 10;
        Integer b2 = 7;
        System.out.println("a1 + b1 = " + (a2 + b2));
        System.out.println("a1 - b1 = " + (a2 - b2));
        System.out.println("a1 / b1 = " + (a2 / b2)); //Ціла частина від ділення
        System.out.println("a1 * b1 = " + (a2 * b2));

        //Спосіб 3
        Scanner a3 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = a3.nextInt();
        Scanner b3 = new Scanner(System.in);
        System.out.println("Enter the second number");
        int number2 = b3.nextInt();
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        if (number2 == 0) {
            System.out.println("На нуль ділити не можна");
        }
        else {
            System.out.println(number1 / number2);
        }
        System.out.println(number1 * number2);
    }
}
