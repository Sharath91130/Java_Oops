package Lamda_Expressoion;

public class demoApp {
    public static void main(String[] args) {


        Demo1 ref = (int a,int b) -> {
            System.out.println(a+b);
        };
        ref.helo(10,20);
    }
}
