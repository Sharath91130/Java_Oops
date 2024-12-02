package OppsPillars;

public class Maganize  extends Library_abstact{
    public int getIsuueNumber() {
        return isuueNumber;
    }

    public void setIsuueNumber(int isuueNumber) {
        this.isuueNumber = isuueNumber;
    }

    int isuueNumber;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    int frequency;

    @Override
    void dislayDetails() {
        setIsuueNumber(123);
        System.out.println("issue number"+" "+getIsuueNumber());
        setFrequency(342);
        System.out.println("Frequency number"+" "+getFrequency());
    }

    @Override
    void calculateTentalFee() {
        System.out.println("frequency "+" "+getFrequency() +"of" + getIsuueNumber());
    }
}
