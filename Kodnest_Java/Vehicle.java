package Kodnest_Java;

// Base Vehicle class
class Vehicle {

    public Vehicle manufacture() {
        System.out.println("Manufacturing a vehicle");
        return this;
    }
}


class Car extends Vehicle {
    public Car manufacture() {
        System.out.println("Manufacturing a car");
        return this;
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle manufacture() {
        System.out.println("Manufacturing a motorcycle");
        return this;
    }
}
class Mian {

    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Vehicle manufacturedVehicle = vehicle.manufacture();
        Car manufacturedCar = car.manufacture();
        Motorcycle manufacturedMotorcycle = motorcycle.manufacture();
        System.out.println("Manufactured vehicle type: " + manufacturedVehicle.getClass().getSimpleName());
        System.out.println("Manufactured car type: " + manufacturedCar.getClass().getSimpleName());
        System.out.println("Manufactured motorcycle type: " + manufacturedMotorcycle.getClass().getSimpleName());

    }

}