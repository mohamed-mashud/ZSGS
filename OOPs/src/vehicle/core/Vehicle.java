package vehicle.core;

public abstract class Vehicle {
    private String color;
    private String energySource;
    private byte tireCount;
    private byte seatingCapacity;

    public Vehicle(String color, String energySource, byte tireCount, byte seatingCapacity) {
        this.color = color;
        this.energySource = energySource;
        this.tireCount = tireCount;
        this.seatingCapacity = seatingCapacity;
    }

    public Vehicle() {}

    public abstract float getMileage();

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getTireCount() {
        return tireCount;
    }

    public void setTireCount(byte tireCount) {
        this.tireCount = tireCount;
    }

    public byte getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(byte seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

}
