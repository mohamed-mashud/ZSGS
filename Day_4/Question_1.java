// ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
// ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
// Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
// Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
// Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.

public class Question_1 {
    public static void main(String[] args) {
        
        Audi R8 = new Audi(30, 231210, 23210, 2, 3, "Petrol", "Alumninum");
        Ford Mustang = new Ford(30, 231210, 23210, 2, 3, "Petrol", "Alumninum");


        Bajaj pulsar = new Bajaj(30, 2310, 4, 5, "Liquid", "two wheeler", 10, "Race");
        TVS xl = new TVS(70, 2310, 2, 4, "Liquid", "two wheeler", 10, "moped");

        R8.display();
        Mustang.display();

        pulsar.display();
        xl.display();
    }
}

class Vehicle {
    double mileage, price;

    public Vehicle(double mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }

    
    void display() {
        System.out.println("Mileage: " + this.mileage + " Price: " + this.price);
    }
}

class Car extends Vehicle {
    double ownership_cost;
    int warranty, seating_capacity;
    String fuel_type;

    public Car(double mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
        super(mileage, price);
        this.ownership_cost = ownership_cost;
        this.warranty = warranty;
        this.seating_capacity = seating_capacity;
        this.fuel_type = fuel_type;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Ownership Cost: " + this.ownership_cost + " Warranty: " + this.warranty + "Seating Capacity: " + this.seating_capacity + " Fuel Type: " + this.fuel_type);
    }
}

class Bike extends Vehicle {
    int no_of_cylinders, no_of_gears;
    String cooling_type, wheel_type;
    double fuel_tank_size;

    public Bike(
        double mileage, double price, int no_of_cylinders, int no_of_gears,
        String cooling_type, String wheel_type, double fuel_tank_size) {

            super(mileage, price);
            this.no_of_cylinders = no_of_cylinders;
            this.no_of_gears = no_of_gears;
            this.cooling_type = cooling_type;
            this.wheel_type = wheel_type;
            this.fuel_tank_size = fuel_tank_size;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Number of Cylinders: " + this.no_of_cylinders + 
                        "Number of Gears " + this.no_of_gears +
                        "Cooling Type: " + this.cooling_type +
                        "Wheel Type: " + this.wheel_type +
                        "Fuel Tank Size: " + this.fuel_tank_size);
    }
}

class Audi extends Car {
    String model_type;

    public Audi(
        double mileage, double price, double ownership_cost, int warranty,
        int seating_capacity, String fuel_type, String model_type) {
            super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
            this.model_type = model_type;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Model Type: " + this.model_type);
    }
}
class Ford extends Car {
    String model_type;
    
    public Ford(
        double mileage, double price, double ownership_cost, int warranty,
        int seating_capacity, String fuel_type, String model_type) {
            super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
            this.model_type = model_type;
        }

    @Override
    void display() {
        super.display();
        System.out.println("Model Type: " + this.model_type);
    }
}

class Bajaj extends Bike {
    String make_type;

    public Bajaj(
        double mileage, double price, int no_of_cylinders, int no_of_gears,
        String cooling_type, String wheel_type, double fuel_tank_size, String make_type) {
            super(mileage, price, no_of_cylinders, no_of_gears, cooling_type, wheel_type, fuel_tank_size);
            this.make_type = make_type;
        }

    @Override
    void display() {
        super.display();
        System.out.println("Make Type: " + this.make_type);
    }
}

class TVS extends Bike {
    String make_type;
    public TVS(
        double mileage, double price, int no_of_cylinders, int no_of_gears,
        String cooling_type, String wheel_type, double fuel_tank_size, String make_type) {
            super(mileage, price, no_of_cylinders, no_of_gears, cooling_type, wheel_type, fuel_tank_size);
            this.make_type = make_type;
        }

    @Override
    void display() {
        super.display();
        System.out.println("Make Type: " + this.make_type);
    }
}