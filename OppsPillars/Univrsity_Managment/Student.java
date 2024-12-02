package OppsPillars.Univrsity_Managment;

public class Student extends Person {
    @Override
    public void performDuties() {
        System.out.println(getName()+" "+"is "+"Studying");
    }
    Adress ad=new Adress();

    @Override
    public void get_Details() {


        System.out.println(" Student age" +" "+ getAge());
        System.out.println("Student Name:" +" "+ getName());
        System.out.println("Student Id:"+" "+getId());

        ad.getAdress();


    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    int rollNumber;

        String Address="bengaluru";


      public void getDetailsApproach(Student student){
          student.get_Details();
      }
       int count=0;
      public void getDetailsAporachWithAbstarct(String name,int age ,int countted){
          setName(name);
          setAge(age);
          get_Details();
          count++;
          countted=count+countted;
          System.out.println("Users registartaion number"+" "+count);

      }
      public void getDetailsAporachWithAbstarct(String name,int age,int id,String univ,int counted){

          setName(name);
          setAge(age);
        setId(id);
          get_Details();
          University.getDetailsOfUniv(univ);
          count++;
          counted=count+counted;
          System.out.println("Users registartaion number"+" "+counted);


      }
    public void getDetailsAporachWithAbstarct(String name,int age,int id,int rool,int counted){

        setName(name);
        setAge(age);
        setId(id);
        setRollNumber(rool);
        get_Details();
        System.out.println("Users registartaion number"+" "+counted);


    }
    public void get_Details_Include_Department(String name,int age,int id,int rollNumber,int counted,String depatment){
        setName(name);
        setAge(age);
        setId(id);
        setRollNumber(rollNumber);
        get_Details();
        count++;
        counted=count+counted;
        System.out.println("Users registartaion number"+" "+counted);
        new Depatment().setDepartment(depatment);
        System.out.print("Department is");
        new Depatment().getDepartmentDetails();
    }

}
