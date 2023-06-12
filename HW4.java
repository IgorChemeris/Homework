import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {

        parityNumber(17);

        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = c1.nextInt();
        Scanner c2 = new Scanner(System.in);
        System.out.println("Enter the second number");
        int number2 = c2.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " більше " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " більше " + number1);
        } else {
            System.out.println(number1 + " дорівнює " + number2);
        }

        int number3 = 5;
        int number4 = 7;
        if (number3 < number4) {
            System.out.println(number3 + " менше " + number4);
        } else if (number3 > number4) {
            System.out.println(number4 + " менше " + number3);
        } else {
            System.out.println(number3 + " дорівнює " + number4);
        }
    }

    private static void parityNumber(int i) {
        if (i % 2 == 0) {
            System.out.println(i + " - число парне");
        } else {
            System.out.println(i + " - число непарне");
        }
    }
}