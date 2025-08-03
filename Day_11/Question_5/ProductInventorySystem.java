package Question_5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ProductInventorySystem {
    private Scanner scanner = new Scanner(System.in);
    private final String FILE_NAME = "products.dat";
    private HashSet<Integer> productIDSet = new HashSet<>();

    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            products = (ArrayList<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    public boolean addProduct(Product product) {
        ArrayList<Product> products = getAllProducts();
        products.add(product);
        productIDSet.add(product.getProductId());
        return writeProductIntoFile(products);
    }

    public boolean updateProductByID(int productId) {
        if(!productIDSet.contains(productId))   return false;
        ArrayList<Product> products = getAllProducts();

        Product productToUpdate = null;
        for(Product product : products)
            if(product.getProductId() == productId) {
                productToUpdate = product;
                break;
            }

        System.out.println("Enter the product Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the product price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the product Quantity: ");
        int quantity = scanner.nextInt();

//        assert productToUpdate != null; (whats this ?? )
        productToUpdate.setName(name);
        productToUpdate.setPrice(price);
        productToUpdate.setQuantity(quantity);
        writeProductIntoFile(products);
        return true;
    }

    public boolean deleteProductByID(int productId) {
        if(!productIDSet.contains(productId))   return false;
        productIDSet.remove(productId);
        ArrayList<Product> products = getAllProducts();
        for(Product product : products) {
            if(product.getProductId() == productId) {
                products.remove(product);
                break;
            }
        }
        writeProductIntoFile(products);
        return true;
    }

    public boolean searchProductByID(int productId) {
        if(!productIDSet.contains(productId))   return false;

        ArrayList<Product> products = getAllProducts();
        for(Product product : products)
            if(product.getProductId() == productId)
                System.out.println(product);

        return true;
    }

    public boolean writeProductIntoFile(ArrayList<Product> products) {
        try (
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for(Product product : products) {
                oos.writeObject(product);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Product getProductDataFromUser() {
        System.out.println("Enter the product Id: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the product Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the product price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the product Quantity: ");
        int quantity = scanner.nextInt();

        return new Product(productId, name, price, quantity);
    }

    public void display(ArrayList<Product> products) {
        for(Product product : products) {
            System.out.println(product);
        }
    }
}
