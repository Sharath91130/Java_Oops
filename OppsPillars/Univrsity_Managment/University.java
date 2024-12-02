package OppsPillars.Univrsity_Managment;

public class University {
    public  static String universityName="Visvesvaraya Technological University";

   //Student student=new Student();
    int count=0;
  public  void get_details_from_univirsity(Student student){

//      Depatment dep=new Depatment();
      student.get_Details_Include_Department("Ajith", 23,9404, 121020, count+1,"Computer Science");
      System.out.print("University :"+" "+universityName);



  }

  public   void   get_dep_details(Depatment depatment){
      depatment.setDepartment("computer Science");
     
  }
  public void get_details_Professor(Professor professor){
      professor.get_details_professor("punith", 30, 1030);
       //Depatment d1=new Depatment();
       heler();
      System.out.println("==============================================================");
       professor.get_details_professor("sharath",23, 8055);

       heler();

  }
  public void heler(){
      Depatment d1=new Depatment();
      System.out.print("Working in "+" ");
      d1.getDepartmentDetails();
      System.out.print("Depatment");
  }



    public static void getDetailsOfUniv(String universityName){
        System.out.println(universityName);



    }


}



