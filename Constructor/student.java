package Constructor;
class Object {

}

public class student extends Object{
  int id;
    String name;

    void study(){
        System.out.println("student " + name +" "+ "is study and his id is: " + id);
    }
    public student(int id,String name) {
        id=id;
        name=name;

    }
}
