package vehicle.fuel;

import vehicle.core.Vehicle;

public class FuelPoweredVehicle extends Vehicle {
    private float fuelCapacity;
    private float distanceTravelledOnFullTankInKm;


    public FuelPoweredVehicle() {
        super("Blue", "Petrol", (byte)2, (byte)2); // petrol bike
        this.fuelCapacity = 6.0f;
        this.distanceTravelledOnFullTankInKm = 300.0f;
    }

    public FuelPoweredVehicle(String color, String energySource, byte tireCount, byte seatingCapacity) {
        super(color, energySource, tireCount, seatingCapacity);
        this.fuelCapacity = 6.0f;
        this.distanceTravelledOnFullTankInKm = 300.0f;
    }

    public FuelPoweredVehicle(String color, String energySource, byte tireCount, byte seatingCapacity, float fuelCapacity, float distanceTravelledOnFullTankInKm) {
        super(color, energySource, tireCount, seatingCapacity);
        this.fuelCapacity = fuelCapacity;
        this.distanceTravelledOnFullTankInKm = distanceTravelledOnFullTankInKm;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public float getDistanceTravelledOnFullTankInKm() {
        return distanceTravelledOnFullTankInKm;
    }

    public void setDistanceTravelledOnFullTankInKm(float distanceTravelledOnFullTankInKm) {
        this.distanceTravelledOnFullTankInKm = distanceTravelledOnFullTankInKm;
    }

    public float getMileageInKmPerLiter() {
        return getDistanceTravelledOnFullTankInKm() / getFuelCapacity();
    }

    public float getMileage() {
        return getMileageInKmPerLiter();
    }
}
