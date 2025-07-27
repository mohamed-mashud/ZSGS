// 2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
// sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
// In main:
// Create one ThreeD object using the default constructor.
// Use the setters to set x, y, and z.
// Create the second ThreeD object using the constructor with three arguments.
// in the TwoD class:
// Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
// Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
// ‌
public class Question_2 {
    public static void main(String[] args) {
        ThreeD point_1 = new ThreeD(0, 0, 0);
        ThreeD point_2 = new ThreeD(1,1,1);
        System.out.println(
            "Distance between point_1 and point_2 is: " + point_1.distanceBetweenPoints(point_2)
        );
    }    
}

class TwoD {
    int x, y;

    public TwoD() {
        System.out.println("TwoD default constructor");
    }
    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("TwoD constructor with two arguments");
    }
}

class ThreeD extends TwoD {
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double distanceBetweenPoints(ThreeD other) {
        int x1 = this.x, x2 = other.x,
            y1 = this.y, y2 = other.y,
            z1 = this.z, z2 = other.z;
        
        return Math.sqrt(
            Math.pow(x1 - x2, 2) +
            Math.pow(y1 - y2, 2) +
            Math.pow(z1 - z2, 2) 
        );
        
    }
}