package hw19;

public class SquareOfNumber {
    public static int calculateSquare(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Число менше нуля");
        }
        return number * number;
    }

    public static void main(String[] args) {
        int userInput = -3; // Змінюємо число для різних випадків
        try {
            int result = calculateSquare(userInput);
            System.out.println("Квадрат числа: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}