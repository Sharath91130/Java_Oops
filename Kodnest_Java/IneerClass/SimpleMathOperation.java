package Kodnest_Java.IneerClass;

// Define the MathOperation interface
interface MathOperation {
    int operate(int a, int b);
}

class Main6{
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            public int operate(int a, int b) {
                return a + b;

            }
        };

        int result = addition.operate(5, 3); // Perform the operation
        System.out.println("5 + 3 = " + result); // Print the result
    }
}
