package Kodnest_Java.IneerClass;

// Define the Greeter interface
interface Greeter {
    String greet();
}

 class SimpleGreeter {

    public static void main(String[] args) {
        Greeter anonymousGreeter = new Greeter() {
            @Override
            public String greet() {
                return "Hello from Anonymous Inner Class!";
            }
        };
        System.out.println(anonymousGreeter.greet());
    }
}
