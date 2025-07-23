
// 5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
// ‌
// Create two classes:
// ---Store
// ---Product
// ‌
// Requirements:
// The Store class should have:
// a. storeName and storeLocation as static variables since they are common to all products in the store.
// b. A static method setStoreDetails(String name, String location) to initialize the static variables.
// c. A static method displayStoreDetails() to print store details.
// d. A list to maintain multiple Product objects (i.e., the store contains many products).
// e. A method addProduct(Product product) to add products to the store.
// f. A method displayAllProducts() to display details of all products.
// ‌
// The Product class should have:
// a. Product ID, name, price, and quantity as instance variables.
// b. A constructor to initialize these fields.
// c. A method displayProduct() to show product details.
// ‌
// Task:
// Implement the above classes and demonstrate their use in the main() method by:
// a. Setting store details once.
// b. Creating multiple product objects.
// c. Adding them to the store.
// d. Displaying store and product information.
// ‌
// Also Check how many .class files are generated.

import java.util.ArrayList;

public class Question_5 {
    public static void main(String[] args) {
        
        Store.setStoreDetails("Novoice", "Chennai");
        Product laptop = new Product(0, "asus", 50392, 20);
        Product mobile = new Product(1, "Nothing", 20392, 20);
        
        Store.addProduct(mobile);
        Store.addProduct(laptop);
        Store.displayStoreDetails();
        Store.displayAllProducts();
    }
}

class Store {
    static String storeName;
    static String storeLocation;
    static ArrayList<Product> producList;

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
        producList = new ArrayList<>();  
    }
    
    static void displayStoreDetails() {
        System.out.println("Name " + storeName + " Location : " + storeLocation);
    }

    public static void addProduct(Product product) {
        producList.add(product);
    }

    public static void displayAllProducts() {
        for(Product product : producList) {
            product.displayProduct();
        }
    }
}

class Product {
    int productID;
    String name;
    double price;
    int quantity;

    public Product(int productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println(
            "Product ID : " + this.productID +
            "\nProduct Name : " + this.name +
            "\nProduct Price : " + this.price +
            "\nProduct Quantity : " + this.quantity
        );
    }
}