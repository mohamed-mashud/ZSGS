package vehicle.electric;

public class ElectricScooter extends ElectricPoweredVehicle {
    public ElectricScooter() {}

    ElectricScooter(String color, String energySource, byte tireCount, byte seatingCapacity, float batteryCapacityInkWh, float energyConsumptionInkWhPerKm) {
        super(color, energySource, tireCount, seatingCapacity, batteryCapacityInkWh, energyConsumptionInkWhPerKm);
    }
}
