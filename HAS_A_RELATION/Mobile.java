package HAS_A_RELATION;

public class Mobile {
    String brand="mi";
    String color="green";
     OSForMobile os=new OSForMobile();
     void port(Charger c){
         System.out.println("===Charger===");
         System.out.println(c.brand);
         System.out.println(c.color);
         System.out.println(c.input);
         c.PassingElecticPower();

     }


}
