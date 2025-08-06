//5. Implement a basic producer-consumer problem using wait() and notify().
//--->Producer thread should add items to a shared buffer.
//--->Consumer thread should remove items.
// Ensure the buffer size is limited to 5 items
// Use Threads to implement the ATM machine, where create thread to check the PIN number
// another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.

import java.util.ArrayList;

public class Question_5 {
    public static void main(String[] args) {
        Pantry pantry = new Pantry();

        Thread producer = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception in sleep producer" + e.getMessage());
                }
                pantry.produceProducts();
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception in sleep producer" + e.getMessage());
                }
                pantry.consumeProducts();
            }
        });

        producer.setName("Producer");
        consumer.setName("Consumer");
        producer.start();
        consumer.start();
    }
}

class Pantry {
    private final ArrayList<Product> products;
    private final int MAX_LIMIT = 5;

    public Pantry() {
        this.products = new ArrayList<>(MAX_LIMIT);
    }

    public synchronized void produceProducts() {
        while(products.size() >= MAX_LIMIT)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught in adding the product " + e.getMessage());
            }

        int maxPrice = 3210;
        int randomPrice = (int) (Math.random() * maxPrice);
        int randomId = (int) (Math.random() * 100);
        Product product = new Product("Product " + randomId, randomPrice);
        products.add(product);
        System.out.println("Producer added : " + product);
        notify();
    }

    public synchronized void consumeProducts() {
        while (products.isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught in consuming the product " + e.getMessage());
            }

        Product productToConsume = products.get(0);
        products.remove(0);
        System.out.println("Consumer consumed : " + productToConsume);
        notify();
    }
}

class Product {
    private String name;
    private double price;
    private static int productCount;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}