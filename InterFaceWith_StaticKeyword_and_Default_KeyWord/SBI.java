package InterFaceWith_StaticKeyword_and_Default_KeyWord;

public  class SBI implements RBI{
    @Override
    public void withdraw() {
        System.out.println("i am withdrawimng money in sbi bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("i am checkBalancemoney in sbi bank");
    }
}
