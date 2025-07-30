// 5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
import java.util.ArrayList;

public class Question_5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user_1 = new User();
        
        user_1.setUserName("Naveen");
        user_1.setEmail("navBar@gmail.com");
        
        User user_2 = (User)user_1.clone();
        System.out.println(user_2.toString());
    }
}

// allowing user class to be cloned 
// by implementing cloneable
class User implements Cloneable{
    private String userName;
    private String email;
    private ArrayList<Product> products;
    
    public User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", email=" + email + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ArrayList<Product> getProducList() {
        return products;
    }

    public void setProducList(ArrayList<Product> producList) {
        this.products = producList;
    }
}

class Product {
    private String name;
    private double price;

    public Product() {
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
}