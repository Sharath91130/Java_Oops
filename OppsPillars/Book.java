package OppsPillars;

public class Book extends Library_abstact{
    int ibsn;

    public int getNumberifpages() {
        return numberifpages;
    }

    public void setNumberifpages(int numberifpages) {
        this.numberifpages = numberifpages;
    }

    int numberifpages;

    @Override
    void dislayDetails() {
        System.out.println("tilele"+getTitle());
    }

    @Override
    void calculateTentalFee() {
        setNumberifpages(100);
        System.out.println("page:" +getNumberifpages()+"total pages");
    }

    public static void main(String[] args) {
        Library_abstact lb=new Library_abstact() {
            @Override
            void dislayDetails() {
                setTitle("java");
                System.out.println("tilele"+" "+getTitle());
                setPublication_year(2019);
                System.out.println("publication year" +" "+ getPublication_year());
                setAuthor("sir tim berners");
                System.out.println("author of java"+" "+getTitle());
            }

            @Override
            void calculateTentalFee() {


            }
        };
        lb.dislayDetails();
        Book b=new Book();
        b.dislayDetails();
        b.calculateTentalFee();
    }
}
