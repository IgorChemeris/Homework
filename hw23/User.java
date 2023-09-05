package hw23;

public class User {
    @AgeValidation(minAge = 18, maxAge = 60, message = "Вік користувача не відповідає обмеженням")
    private int age;

    public User(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User(30);

        try {
            AgeValidator.validateAge(user);
            System.out.println("Користувач віком в межах допустимого.");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка валідації: " + e.getMessage());
        }
    }
}