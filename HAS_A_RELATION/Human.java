package HAS_A_RELATION;

public class Human  {
    String height="80cm";
    String weight="70kg";
    Heart h =new Heart();
    void bookDetails(book b) {
        System.out.println(b.author);
        System.out.println(b.price);
        System.out.println(b.title);
        b.userRead();
        b.bookDetails();
    }

}
