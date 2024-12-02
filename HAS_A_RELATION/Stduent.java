package HAS_A_RELATION;

public class Stduent extends Human {
    Brain brain=new Brain();
    //Heart heart=new Heart();

    int id=101;

    String name="sharath";
    void StudentHeightAndWeight(){
        System.out.println(name+" height is "+" "+height);
        System.out.println(name+" weight is "+" "+weight);
        System.out.println(name+" "+"heart color is "+" "+h.color);

    }
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
    void study(){
        System.out.println("Student is reading");
    }
    void StudyHelp(Brain b){
        System.out.println("Student is reading using "+b.weight+" "+"weights");
    }
    void StudentCarDetaisl(Car c){
        System.out.print(c.brand);
        System.out.print(c.color);
        c.Drive();

    }
//    void bookDetails(book b){
//        System.out.println(b.author);
//        System.out.println(b.price);
//        System.out.println(b.title);
//        b.userRead();




}
