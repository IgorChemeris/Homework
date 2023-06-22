import java.util.Random;

public class HW7 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }

            int minnumber = array[0];
            int maxnumber = array[0];
            int sum = 0;

        for (int i = 0; i < array.length; i++) {

                if (array[i] < minnumber) {
                    minnumber = array[i];
                }
                if (array[i] > maxnumber) {
                    maxnumber = array[i];
                }
                sum += array[i];
            }
        System.out.println("Мінімальне значення дорівнює " + minnumber);
        System.out.println("Максимальне значення дорівнює " + maxnumber);
        System.out.println("Сума значень дорівнює " + sum);
        System.out.println("Середнє значення дорівнює " + (sum / array.length));

    }
}
