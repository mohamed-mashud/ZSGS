package Question_5;
// Design a Java application to manage a product inventory system using file handling and object serialization.
//Create a class Product with the following attributes:
//--->int productId
//--->String name
//--->double price
//--->int quantity
// Ensure the class implements the Serializable interface.
// Methods:
//--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
//--->View All Products: Read all product objects from the file and display them.
//--->Search Product by ID: Search for a product by productId in the file and display its details if found.
//--->Update Product: Locate a product in the file using the ID, update its price or quantity,
//                     and save the changes back to the file.
//--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
//--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.

import java.util.ArrayList;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        ProductInventorySystem pis = new ProductInventorySystem();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(
                """
                Product Inventory System
                1) Add a Product
                2) View all Products
                3) Search Product by ID
                4) Update Product by ID
                5) Delete Product by ID
                6) Exit
                """
            );
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    pis.addProduct(pis.getProductDataFromUser());
                    break;
                case 2:
                    pis.display(pis.getAllProducts());
                    break;
                case 3:
                    System.out.println("Enter product id to search: ");
                    int productIdToSearch = scanner.nextInt();
                    if(!pis.searchProductByID(productIdToSearch))
                        System.out.println("Product id not found");
                    break;
                case 4:
                    System.out.println("Enter product id to update: ");
                    int productIdToUpdate = scanner.nextInt();
                    pis.updateProductByID(productIdToUpdate);
                    break;
                case 5:
                    System.out.println("Enter product id to delete: ");
                    int productIdToDelete = scanner.nextInt();
                    pis.deleteProductByID(productIdToDelete);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

