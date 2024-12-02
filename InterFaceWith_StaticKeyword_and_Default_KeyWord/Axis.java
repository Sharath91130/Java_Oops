package InterFaceWith_StaticKeyword_and_Default_KeyWord;

public class Axis implements RBI{
    @Override
    public void withdraw() {
        System.out.println("i am withdraw money in axis bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("i am checkBalance money in axis  bank");
    }
    public void changePin(){

        RBI.resetAtmPin(1234);
    }
    public void showPass(){
        RBI.showPassword();
    }
}
