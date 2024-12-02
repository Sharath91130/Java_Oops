package OppsPillars.Univrsity_Managment;

public class Professor  extends Person{
    @Override
    public void performDuties() {
        System.out.println("Profrssor teaching this subject"+subjectsTaught);
    }
   // String department="Computer Science";
   static  String subjectsTaught="Network";
    Depatment dep=new Depatment();


    @Override
    public void get_Details() {
        System.out.println(" Professor details:"+" "+getName());
        System.out.println("Professor Age:"+" "+getAge());

        System.out.println("Profeesor Specialist in the "+" "+subjectsTaught);

        //dep.getDepartmentDetails();
    }
    public void get_details_professor(String name,int age,int id){
        setName(name);
        setAge(age);
        performDuties();
        get_Details();


    }


}
