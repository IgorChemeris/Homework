package hw22;

interface Product {
    void create();
}

class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Створено продукт A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Створено продукт B");
    }
}

class ProductFactory {
    public Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ConcreteProductA();
        } else if ("B".equals(type)) {
            return new ConcreteProductB();
        } else {
            throw new IllegalArgumentException("Невідомий тип продукту");
        }
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        Product productA = factory.createProduct("A");
        productA.create();

        Product productB = factory.createProduct("B");
        productB.create();
    }
}
