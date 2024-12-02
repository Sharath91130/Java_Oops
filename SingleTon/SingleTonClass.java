package SingleTon;

public class SingleTonClass {
    private SingleTonClass(){


    }
    private  static SingleTonClass instance=null;
    public static SingleTonClass getInstance(){
        if(instance==null){
            instance=new SingleTonClass();
            System.out.println("one time");
        }
        else{
            System.out.println("get lost Man i am only Single don't mingle with me");
        }
        return instance;
    }

}
