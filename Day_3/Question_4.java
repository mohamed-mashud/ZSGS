// 4. Design the Vehicle class that stores information about a 
// vehicle such as its vehicle ID, brand name, and price, such 
// that it can internally keep track of how many vehicles have 
// been created so far, without requiring manual counting from 
// outside the class.

public class Question_4 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(1, "Toyota", 20000);
        Vehicle vehicle2 = new Vehicle(2, "Honda", 25000);

        System.out.println(vehicle1.getVehicleCount());
    }
}

class Vehicle {
    private static int vehicleCount = 0;
    private int vehicleId;
    private String brandName;
    private double price;

    public Vehicle(int vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        vehicleCount++;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }
}
