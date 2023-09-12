package hw25;

import java.util.Random;

public class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(10) + 1;
            System.out.println("Згенеровано число: " + number);

            if (number == 5) {
                System.out.println("Згенеровано число 5. Потік завершує роботу.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator thread = new NumberGenerator();
        thread.start();
    }
}