package anonymous_InnerClass_Type;

public  class Demo1App {
    public static void main(String[] args){
        Demo1 d=new Demo1(){
            public void hello(){
                System.out.println("interface hello");
            }
            public void bye(){
                System.out.println("bye");
            }
        };

    d.hello();
    d.bye();
    }
}
