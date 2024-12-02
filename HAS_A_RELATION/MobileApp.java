package HAS_A_RELATION;

public class MobileApp {
    public static void main(String[] args) {
        Mobile phone=new Mobile();
        System.out.println("Accesing version name");
        System.out.println(phone.os.name+" "+phone.os.version);

        System.out.println("Accesing mobile prpoerties");
        System.out.println(phone.brand+" /n"+phone.color);


        System.out.println("accesing charger properties");

       // System.out.println(phone.port(Charger));
        Charger c=new Charger();
        phone.port(c);


        System.out.println("mobile is gone ");
        phone=null;
        System.out.println("Accesing version name after gone mobile");
       phone.port(c);
        System.out.println(phone.os.name+" "+phone.os.version);
//c.n

    }
}
