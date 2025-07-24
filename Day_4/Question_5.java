// 5. Create a class named Shape with a method that prints "This is a shape". 
// Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". 
// Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively.
// Again, make another class named Square having the same method which prints "Square is a rectangle".
// Now, try calling the method by the object of each of these classes.

public class Question_5 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.display();
       
        Shape polygon = new Polygon();
        polygon.display();
       
        Shape rectangle = new Rectangle();
        rectangle.display();
       
        Shape triangle = new Triangle();
        triangle.display();
       
        Shape square = new Square();
        square.display();

        /**
         * outputs:
         *  This is a shape
            Polygon is a shape
            Rectangle is a polygon
            Triangle is a polygon
            Square is a Polygon
         */
    }
}


class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    void display() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    void display() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    void display() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Polygon {
    void display() {
        System.out.println("Square is a rectangle");
    }
}