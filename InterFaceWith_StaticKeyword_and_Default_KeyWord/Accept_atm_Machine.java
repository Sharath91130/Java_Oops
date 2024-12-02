package InterFaceWith_StaticKeyword_and_Default_KeyWord;

public class Accept_atm_Machine {
    public void accentAnyBank(RBI bank){
        bank.checkBalance();

        bank.withdraw();
        bank.otpGenerater();
       // RBI.resetAtmPin();

    }
}
