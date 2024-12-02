package Kodnest_Java;


public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}
 class Main9{

    public static void main(String[] args) {
        Temperature temp1 = new Temperature(25.0);
        System.out.println("Initial Temperature:");
        System.out.println("Celsius: " + temp1.getCelsius() + " C");
        System.out.println("Fahrenheit: " + temp1.getFahrenheit() + " F");
        temp1.setCelsius(30.0);
        System.out.println("Final Temperature:");
        System.out.println("Celsius: " + temp1.getCelsius() + " C");
        System.out.println("Fahrenheit: " + temp1.getFahrenheit() + " F");
    }
}

