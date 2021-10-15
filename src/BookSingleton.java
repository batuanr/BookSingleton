public class BookSingleton {
    private String author;
    private static BookSingleton book;
    private static boolean isOut;

    private  BookSingleton() {
        author = "kasawoa";
        isOut = false;
    }
    public static synchronized BookSingleton getBook(){
        if (!isOut){
            if (book == null){
                book = new BookSingleton();
            }
            isOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton book){
        isOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookSingleton{" +
                "author='" + author + '\'' +
                '}';
    }
}