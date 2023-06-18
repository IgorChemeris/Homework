import java.util.Scanner;
public class HW6 {
    public static void main(String[] args) {

        numberCube();
        numberPower();
        star();
        symbol();
    }
    //Створити метод який повертає куб заданого числа
    private static void numberCube() {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number1 = a1.nextInt();
        System.out.println(number1 + " в третій степені дорівнює " + (number1 * number1 * number1));
    }

    //Задана степінь заданого числа
    private static void numberPower() {
        Scanner a2 = new Scanner(System.in);
        System.out.println("Введіть число");
        int number1 = a2.nextInt();
        Scanner b2 = new Scanner(System.in);
        System.out.println("Введіть показник степеня");
        int number2 = b2.nextInt();
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;
        }
        System.out.println(number1 + " в степені " + number2 + " дорівнює " + result);
    }

    //Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
    private static void star() {
       Scanner c3 = new Scanner(System.in);
       System.out.println("Введіть число");
        int number3 = c3.nextInt();
        String result3 = "";
        for (int j = 1; j <= number3; j++) {
            result3 += "*";
        }
        System.out.println(result3);
    }

    //Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод

    private static void symbol() {
        Scanner d1 = new Scanner(System.in);
        System.out.println("Введіть символ");
        String symbol1 = d1.next();
        Scanner d2 = new Scanner(System.in);
        System.out.println("Введіть кількість");
        int number4 = d2.nextInt();
        String result4 = "";
        for (int k = 1; k <= number4; k++) {
            result4 += symbol1;
        }
        System.out.println(result4);
    }
}
