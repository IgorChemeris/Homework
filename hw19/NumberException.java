package hw19;

import java.util.Scanner;

public class NumberException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введіть число: ");
                int number = scanner.nextInt();
                System.out.println("Ви ввели число: " + number);
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Помилка: Введені дані не є цілим числом.");
                scanner.nextLine(); // Очистити буфер введення
            }
        }

        scanner.close();
    }
}