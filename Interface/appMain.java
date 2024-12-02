package Interface;

public class appMain implements sample5{
    @Override
    public void add() {
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    @Override
    public void sub() {
        int a=10;
        int b=20;
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        appMain obj=new appMain();
        obj.add();
        obj.sub();
    }
}
