package vehicle.fuel;

public class Bike extends FuelPoweredVehicle{
    public Bike() {
        super("Blue", "Petrol", (byte) 2, (byte) 2);
    }

    Bike(String color, String energySource, byte tireCount, byte seatingCapacity) {
        super(color, energySource, tireCount, seatingCapacity);
    }
}
