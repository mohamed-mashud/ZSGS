package vehicle.fuel;

public class Scooter extends FuelPoweredVehicle {
    public Scooter() {
        super("pink", "Petrol", (byte)2, (byte)2, 6.0f, 180.f);
    }

    public Scooter(String color, String energySource, byte tireCount, byte seatingCapacity) {
        super(color, energySource, tireCount, seatingCapacity);
    }
}
