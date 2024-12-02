package InnerClass;

public class StaticInnerClass {
    static class Inner {
        String state;

        String address;

        public Inner(String state, String address) {
            this.state = state;
            this.address = address;
            System.out.println(state+" "+address);
        }

    }
    //Inner in=new Inner("bengaluru","shivamogga");
}
