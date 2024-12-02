package Interface;

public final class epsonCalculator extends scientificCalculator{
    
    @Override
    public void div(int a,int b) {
        System.out.println(a/b);
    }
    public static boolean isprime(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {

       boolean ans= isprime(17);
        System.out.println("prime checking");
        System.out.println(ans);
        System.out.println("----------");
        epsonCalculator obj=new epsonCalculator();
        System.out.println("addition of two number");
        obj.add(10,20);
        System.out.println("-----------");
        System.out.println("division");
        obj.div(50,20);
        System.out.println("----------");
        System.out.println("mod");
        obj.mod();
        System.out.println("------------");
        System.out.println("multiplication");
        obj.mul(10,20);
        System.out.println("-----------");
        System.out.println("subraction");
        obj.sub(489,80);
    }
}
