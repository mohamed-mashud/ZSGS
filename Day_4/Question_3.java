// 3. A class Point is declared as follows:
// class Point{
// public:
// Point(){int=0;int=0;} //default constructor
// void setPoint(int,int); //set coordinates
// int getX() const {return x;} //get x coordinates
// int getY() const {return y;} //get y coordinates
// void printPoint(); // print (x,y) coordinates
// private int x;
// private int y;
// };
// Write the implementation of the class Point in the same file.
// Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
// Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
// Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
// Enter x: 2
// Enter y: 2
// Enter radius: 1
// Circle center is (2,2)
// Radius is 1
// Area is 3.14

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(x, y, radius);
        
        System.out.println("Circle center is (" + circle.getX() + ", " + circle.getY() + ")");
        System.out.println("Area is" + circle.area());
    }
}

class Point {
    private int x = 0, y = 0;
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        x = 0;
        y = 0;
    }

    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {    return x;   }
    int getY() {    return y;   }
    
    void printPoint() {
        System.out.println("x : " + this.x + " y :" + this.y);
    }
}

class Circle extends Point {
    double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        if(radius >= 1)
            this.radius = radius;
        else 
            this.radius = 1;
    }

    public void setRadius(double radius) {
        if(radius <= 0)
            this.radius = 1;
        else 
            this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return 3.14 * this.radius * this.radius;
    }
}