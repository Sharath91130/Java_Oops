package InterFaceWith_StaticKeyword_and_Default_KeyWord;

public interface RBI {
    void withdraw();
    void checkBalance();
    static void  resetAtmPin(int n){
        System.out.println("your new Password"+" "+n);
    }
    static void showPassword(){
        System.out.println("your password is 86868");
    }
    default void otpGenerater(){
        System.out.println("j");
    }
}
