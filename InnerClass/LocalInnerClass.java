package InnerClass;

public class LocalInnerClass {
    public void display(){
        class inner{
            String addrees;
            String state;

            public inner(String adress,String state){
                this.addrees=adress;
                this.state=state;
            }
        }
        inner in=new inner("bengaluru", "karnataka");
        System.out.println(in.addrees+" "+in.state);
    }

}
