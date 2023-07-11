package hw10;

public class OrderOfExecution {
    static int order = getOrder();
    static int getOrder() {
        System.out.println("1");
        return 0;
    }

    static {
        System.out.println("2");
    }

    {
        System.out.println("7");
    }
    public OrderOfExecution() {
        System.out.println("8");
    }
    public static void Order3() {
        System.out.println("3");
    }

}
