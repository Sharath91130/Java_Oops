package Constructor.chaining;

public class demo1 {
    int a;
    int b;
    String  c;
    public demo1(){
//        a=10;
//        b=20;
//        c="sharath";

    }
public void display2(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);;
}
public demo1(int a){
        super();
        this.a=a;

}
public demo1(int a,int b,String c){
        this();
        this.a=a;
        this.b=b;
        this.c=c;

}

}
