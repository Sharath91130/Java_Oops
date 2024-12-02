package AccessModifires.Protected;

import java.util.ArrayList;
import java.util.Arrays;

public class p {
   public   int m;
    protected String name;

    protected void display(){
        System.out.println(m+" "+name);
    }

    public static void main(String[] args) {
        p ob=new p();
        System.out.println(ob.m);
        ArrayList <Integer>lis=new ArrayList();
        lis.add(1);
        lis.add(2);
        System.out.println(lis.toString());
    }

}
