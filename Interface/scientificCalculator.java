package Interface;

public abstract class scientificCalculator extends calculator implements calculator_Interface1,calculator_interface2 {
    @Override
    public void add(int a,int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a,int b) {

        System.out.println(a-b);
    }

    @Override
    public void mul(int a,int b) {
        System.out.println(a*b);
    }
}
