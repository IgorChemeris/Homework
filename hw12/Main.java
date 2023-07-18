package hw12;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Pilot pilot = new Pilot();

        driver.drive();
        driver.fly();

        pilot.drive();
        pilot.fly();

    }
}
