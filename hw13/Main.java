package hw13;

public class Main {
    public static void main(String[] args) {
        Pair <Integer, Integer> integerPair = new Pair<>(5, 25);
        int firstInt = integerPair.getFirst();
        int secondtInt = integerPair.getSecond();
        System.out.println(integerPair);
        System.out.println(firstInt);
        System.out.println(secondtInt);

        Pair <String, String> stringPair = new Pair<>("Hello", "Goodbye");
        String firstString = stringPair.getFirst();
        String secondString = stringPair.getSecond();
        System.out.println(stringPair);
        System.out.println(firstString);
        System.out.println(secondString);

        Pair <Person, Person> personPair = new Pair<>(new Person("Igor"), new Person("Yulia"));
        Person firstPerson = personPair.getFirst();
        Person secondPerson = personPair.getSecond();
        System.out.println(personPair);
        System.out.println(firstPerson);
        System.out.println(secondPerson);
    }

    static class Person {private String name; public Person(String name) {
        this.name = name;
    }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
