package TypeCastingForOPPs.OverRiden;

public class vechicle {
    String make;

    String model;

    double price;

    int vehicleId;

    public void displayDetails() {

        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Make " + make);
        System.out.println("Model: " + model);
        System.out.println("Price:" + price);


    }

    public void applyDiscount(double percentage) {
        price -= price* (percentage / 100);

        System.out.println("New Price after discount: $" + price);

    }
}
