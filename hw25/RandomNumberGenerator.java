package hw25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() {
        return ThreadLocalRandom.current().nextInt(1, 51);
    }

    public static void main(String[] args) throws Exception {
        int numberOfThreads = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        Future<Integer>[] futures = new Future[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            Callable<Integer> task = new RandomNumberGenerator();
            futures[i] = executorService.submit(task);
        }

        for (int i = 0; i < numberOfThreads; i++) {
            Integer result = futures[i].get();
            System.out.println("Потік " + (i + 1) + " згенерував число: " + result);
        }

        executorService.shutdown();
    }
}
