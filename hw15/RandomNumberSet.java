package hw15;

import java.util.*;

public class RandomNumberSet {
    public static void main(String[] args) {
        int numberOfIterations = 1000;
        int minRange = 1;
        int maxRange = 50;

        Random random = new Random();

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            hashSet.add(randomNumber);
        }
        System.out.println("HashSet: " + hashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            treeSet.add(randomNumber);
        }
        System.out.println("TreeSet: " + treeSet);

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < numberOfIterations; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            linkedHashSet.add(randomNumber);
        }
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
