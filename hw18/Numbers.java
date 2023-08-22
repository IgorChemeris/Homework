package hw18;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> numbers = new Random().ints(10, 1, 50) // Заповнюємо лист 10 випадковими числами від 1 до 50
                .boxed() // Перетворюємо інтові значення на обгорнуті Integer
                .collect(Collectors.toList());

        System.out.println("Список випадкових чисел: " + numbers);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Перетворюємо знову на int
                .sum();

        System.out.println("Сума чисел: " + sum);
    }
}