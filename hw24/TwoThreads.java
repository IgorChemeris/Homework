package hw24;

public class TwoThreads {
    public static void main(String[] args) {
        Runnable task1 = new NumberPrinter("Потік 1");
        Runnable task2 = new NumberPrinter("Потік 2");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    private final String threadName;

    public NumberPrinter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}