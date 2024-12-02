package Lamda_Expressoion;

// Define the functional interface

interface Greeter {
    String greet();
}
public class LambdaExample {
    public static void main(String[] args) {
        Greeter lambdaGreeter = () -> "Hello from Lambda!";
        System.out.println(lambdaGreeter.greet());
    }
}
