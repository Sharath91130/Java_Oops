package TypeCastingForOPPs.OverRiden;

public class vechicleApp {
    public static void main(String[] args) {
        vechicle v=new vechicle();
        v.price=100;
        v.make="tayota";
        v.model="benz";
        v.price=303030;
        //`v.applyDiscount(0.23);
        v.displayDetails();
        System.out.println();

    }

}
