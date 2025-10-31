/*
* Design an inheritance hierarchy to calculate mileage of scooter, bike and electric scooter.
* */

import vehicle.fuel.Bike;
import vehicle.electric.ElectricScooter;
import vehicle.fuel.Scooter;
import vehicle.core.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle scooter         = new Scooter();
        Vehicle bike            = new Bike();
        Vehicle electricScooter = new ElectricScooter();
        

        System.out.println(
                "Scooter Mileage        : " + scooter.getMileage() + " km" + "\n" +
                "Bike Mileage           : " + bike.getMileage() + " km" + "\n" +
                "Scooter Range          : " + electricScooter.getMileage() + " km"
        );
    }
}