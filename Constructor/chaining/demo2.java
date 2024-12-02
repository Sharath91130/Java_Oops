package Constructor.chaining;

public class demo2 extends demo1 {
    int x;
    int  y;
    public demo2(){
        x=100;
        y =200;

    }
    public void display(){
        System.out.println("x: " +" " +x +" y" +" "+y);
        System.out.println(a +" "+b+" "+c);
    }
    public demo2(int x){
        this.x=x;

    }
    public demo2(int x ,int y){
        super(100,200,"hello");
        this.x=x;
        this.y=y;
    }

}

