package OppsPillars.Univrsity_Managment;

public class University_Application {
    public static void main(String[] args) {
        Student student=new Student();
//        student.setName("sharath");
//        student.setAge(10);
//        student.setId(1020);
//        student.performDuties();
//        student.get_Details();
//        University uv=new University();
//        Professor professor=new Professor();
//        professor.setAge(23);
//        professor.setId(1001);
//        professor.setName("Punith");
//        professor.Profe_detaisl(professor);
//        professor.performDuties();
//        student.setId(1032);
        //student.getDetailsAporachWithAbstarct(new Student());
//     int count=0;
//      student.getDetailsAporachWithAbstarct("sharath", 10,count+1);
//       System.out.println(".....................................");
////        student.getDetailsAporachWithAbstarct("uday", 23, 108,"vtu",count+1);
//
////        professor=null;
////        professor.get_Details();
//        Get_Details_Indiviually get=new Get_Details_Indiviually();
//        get.getStudent_or_profosseor_details(new Student());

//
//
//        Depatment depatment=new Depatment();
//        depatment.setDepartment("computer Science ");
//        depatment.getDepartmentDetails();
//
//
//
//        Professor professor=new Professor();
//        professor.get_Details();


        University uv=new University();
      uv.get_details_from_univirsity(new Student());
        System.out.println("========================================= HELLO PROCESSOR=========================");
   uv.get_details_Professor(new Professor());

        System.out.println("===========Departmets==============");
        uv.get_dep_details(new Depatment());
        Depatment d1=new Depatment();
                d1.getDepartmentDetails();




    }
}
