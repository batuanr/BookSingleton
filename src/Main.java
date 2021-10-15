public class Main {
    public static void main(String[] args) {
        BookBorrower b1 = new BookBorrower();
        BookBorrower b2 = new BookBorrower();

        b1.borrowBook();
        System.out.println("b1 đang mượn sách");
        System.out.println(b1.getInfo());

        b2.borrowBook();
        System.out.println(b2.getInfo());

        b1.returnBook();
        System.out.println("b1 trả sách");

        b2.borrowBook();
        System.out.println(b2.getInfo());
    }
}
