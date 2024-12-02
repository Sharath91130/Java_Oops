package Lamda_Expressoion;

// Define the functional interface
@FunctionalInterface
interface NumberTester {
    boolean test(int n);
}

class Main6 {
    public static void main(String[] args) {
        NumberTester isEven = n -> n % 2 == 0;
        int number1 = 4;
        int number2 = 7;
        boolean result1 = isEven.test(number1);
        boolean result2 = isEven.test(number2);

        // Print the results
        System.out.println("Is " + number1 + " even? " + result1);
        System.out.println("Is " + number2 + " even? " + result2);
    }
}
