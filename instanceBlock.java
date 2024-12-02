public class instanceBlock {
    int  a;
    {
        a=100;
    }
    static {
        System.out.println("static block");

    }
    {
        System.out.println("instance block ");
        a=300;
        System.out.println(a);
    }
    {
        System.out.println("instance block2");
    }
    public void hello(){
        System.out.println("instance method");
        System.out.println(a);
    }
    public static void hello1(){
        System.out.println("static block");

    }
    public instanceBlock(){
        System.out.println("i am constructor");
        a=200;
    }

    public static void main(String[] args) {
        instanceBlock ib=new instanceBlock();
        ib.hello();
        hello1();

    }
}
