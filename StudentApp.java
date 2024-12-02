public class StudentApp {
    public static void main(String[] args) {
        ObjectsCout s1=new ObjectsCout();
        ObjectsCout s2=new ObjectsCout();
        ObjectsCout s3=new ObjectsCout();
        System.out.println("before create anonymus object "+ObjectsCout.count);
        new ObjectsCout();
        new ObjectsCout();
        System.out.println("after anonymus object creation"+" "+ObjectsCout.count);


    }
}
