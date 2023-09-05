package hw22;

interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request() {

        System.out.println("Виконано запит на реальному об'єкті.");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        System.out.println("Виконано додаткову логіку перед викликом реального об'єкта.");
        realSubject.request();
        System.out.println("Виконано додаткову логіку після виклику реального об'єкта.");
    }
}

public class ProxyPatternExample {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}