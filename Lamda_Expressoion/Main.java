package Lamda_Expressoion;

// Define the functional interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
