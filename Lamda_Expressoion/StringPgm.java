package Lamda_Expressoion;

// Define the functional interface
@FunctionalInterface
interface StringConverter {
    String convert(String s);
}

public class StringPgm {
    public static void main(String[] args) {
        // Create a lambda expression that implements the StringConverter interface to convert a string to uppercase
        StringConverter toUpperCase = s -> s.toUpperCase();
        String input = "hello, world!";
        String result = toUpperCase.convert(input);
        System.out.println(result);
    }
}
