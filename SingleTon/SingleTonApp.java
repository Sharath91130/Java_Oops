package SingleTon;

public class SingleTonApp {
    public static void main(String[] args) {
        SingleTonClass ob=SingleTonClass.getInstance();
        System.out.println("========================");
        SingleTonClass ob1=SingleTonClass.getInstance();


    }
}
