package hw12;

public class Pilot extends Human {
    @Override
    public void drive() {
        System.out.println("Пілот водить");
    }

    @Override
    public void fly() {
        System.out.println("Пілот літає");
    }
}
