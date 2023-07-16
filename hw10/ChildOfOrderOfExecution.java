package hw10;

public class ChildOfOrderOfExecution extends OrderOfExecution {
    static int order = getChildOrder();
    static int getChildOrder() {
        System.out.println("4");
        return 0;
    }

    static {
        System.out.println("5");
    }

    {
        System.out.println("9");
    }

    public ChildOfOrderOfExecution() {
        System.out.println("10");
    }

    public static void ChildOfOrder6() {
        System.out.println("6");
    }
}
