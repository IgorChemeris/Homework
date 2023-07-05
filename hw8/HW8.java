package hw8;

public class HW8 {
    public static void main(String[] args) {

        Student student = new Student("Igor", "Chemeris", 39);
        Teacher teacher = new Teacher("Sergii", "Zhuravlov", 27, student);

        System.out.println(teacher);

    }
}
