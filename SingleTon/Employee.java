package SingleTon;

public class Employee {
    String name;
    int age;
    String gender;
    int salary;
    int depedents;
    int type;
    void work(){
        System.out.println(name+" "+" "+type +"Employee is workng....");
    }
    void applyLeave(){
        System.out.println(name +" "+" Is Apply for leaving");
    }
    private Employee(){

    }

    public Employee(String name,int age,String gender,int salary,int depedents,int type){
        this.age=age;
        this.name=name;
        this.depedents=depedents;
        this.salary=salary;
        this.type=type;

    }
    private static Employee employee=null;
    public static Employee getInstance(){
        if(employee==null){
            employee=new Employee("sharath",22,"male",3400,2,4);
        }
        System.out.println(employee);
        return employee;
    }
}

