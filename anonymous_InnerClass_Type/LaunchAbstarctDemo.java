package anonymous_InnerClass_Type;

public class LaunchAbstarctDemo {
    public static void main(String[] args) {
        AbstarctDemo dem=new AbstarctDemo() {
            @Override
            void hello() {
                System.out.println("helo");
            }

            @Override
            void bye() {
                System.out.println("bye");
            }
        };
        dem.hello();
        dem.bye();
    }
}
