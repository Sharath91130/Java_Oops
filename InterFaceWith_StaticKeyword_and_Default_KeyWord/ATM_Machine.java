package InterFaceWith_StaticKeyword_and_Default_KeyWord;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Accept_atm_Machine accept=new Accept_atm_Machine();
        accept.accentAnyBank(new Axis());
        System.out.println("=====================");
        accept.accentAnyBank(new Union());
        System.out.println("==========================");
        accept.accentAnyBank(new SBI());
        System.out.println("==================");
        Axis ax=new Axis();
        if(str.equals("pass")){

            ax.showPass();
        }

        ax.changePin();
        System.out.println("====================");
        accept.accentAnyBank(new Union());


    }
}
