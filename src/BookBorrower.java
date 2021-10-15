public class BookBorrower {
    private BookSingleton bookBorrower;
    boolean haveBook = false;

    public void borrowBook(){
        bookBorrower = BookSingleton.getBook();
        if (bookBorrower == null){
            haveBook = false;
        }
        else {
            haveBook = true;
        }
    }
    public String getInfo(){
        if (haveBook){
            return bookBorrower.getAuthor();
        }
        else return "i don't have the book";
    }
    public void returnBook(){
        bookBorrower.returnBook(bookBorrower);
    }
}
