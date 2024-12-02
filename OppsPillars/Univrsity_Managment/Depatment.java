package OppsPillars.Univrsity_Managment;

public class Depatment {
private static    String department;
//    public static String  getDep(){
//       return "Computer Science";
//    }
    public void setDepartment(String department){
        this.department=department;
    }
    public  String getDepartment(){

        return department;
    }
    public void getDepartmentDetails(){
        System.out.println(department);
    }

}
