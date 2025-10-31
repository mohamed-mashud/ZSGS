package vehicle.electric;

import vehicle.core.Vehicle;

public class ElectricPoweredVehicle extends Vehicle implements ElectricVehicle {
    private float batteryCapacityInkWh;
    private float energyConsumptionInkWhPerKm;

    ElectricPoweredVehicle() {
        super("Grey", "Battery", (byte)2, (byte)2);
        this.batteryCapacityInkWh = 3.7f;
        this.energyConsumptionInkWhPerKm = 0.037f;
    }

    ElectricPoweredVehicle(String color, String energySource, byte tireCount, byte seatingCapacity, float batteryCapacityInkWh, float energyConsumptionInkWhPerKm) {
        super(color, energySource, tireCount, seatingCapacity);
        this.batteryCapacityInkWh = batteryCapacityInkWh;
        this.energyConsumptionInkWhPerKm = energyConsumptionInkWhPerKm;
    }

    public float getBatteryCapacityInkWh() {
        return batteryCapacityInkWh;
    }

    public void setBatteryCapacityInkWh(float batteryCapacityInkWh) {
        this.batteryCapacityInkWh = batteryCapacityInkWh;
    }

    public float getEnergyConsumptionInkWhPerKm() {
        return energyConsumptionInkWhPerKm;
    }

    public void setEnergyConsumptionInkWhPerKm(float energyConsumptionInkWhPerKm) {
        this.energyConsumptionInkWhPerKm = energyConsumptionInkWhPerKm;
    }

    public float getRange() {
        return getBatteryCapacityInkWh() / getEnergyConsumptionInkWhPerKm();
    }

    public float getMileage() {
        return getRange();
    }
}