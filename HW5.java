import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        //Створити програму для виведення чисел від 1 до 10
        System.out.println("Завдання 1.");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " "); //виведення у рядок
            i++;
        }

        //Показати всі парні числа в діапазоні від 1 до 100
        System.out.print("\n"); //перевод на нову строку після виводу результату 1 завдання
        System.out.println("Завдання 2.");
        for (int j = 1; j <=100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        //Другий варіант 2 завдання
        System.out.println("Завдання 2, варіант 2.");
        for (int j2 = 2; j2 <= 100; j2 += 2) {
            System.out.println(j2);
        }

        //Знайти факторіал числа 7
        System.out.println("Завдання 3.");
        int factorial = 1;
        int k = 1;
        do {
            factorial *= k;
            k++;
        } while (k <= 7);
        System.out.println("Факторіал " + (k-1) + " дорівнює " + factorial);

        //Другий варіант 3 завдання
        System.out.println("Завдання 3, варіант 2.");
        Scanner a3 = new Scanner(System.in);
        System.out.print("Введіть число, факторіал якого, хочете дізнатися ");
        int number = a3.nextInt();
        int l = 1;
        int FACTORIAL = 1;
        while (l <= number) {
            FACTORIAL *= l;
            l++;
        }
        System.out.println("Факторіал " + number + " дорівнює " + FACTORIAL);

        //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        System.out.println("Завдання 4.");
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        System.out.println(n1); //перше число 0.
        System.out.println(n2); //друге число 1.
        while (n3 <= 100) {
            System.out.println(n3); //третє число 1.
            if (n1 ==0 & n2 == 1 ) {
                n3 = 2; //четверте число 2.
            } else {
                n3 = n1 + n2; //з п'ятого числа починає працювати
            }
            n1 = n2;
            n2 = n3;
        }

    }
}
