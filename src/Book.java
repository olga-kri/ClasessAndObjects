public class Book {
   private String bookTitle;
    private Author writer;
    private int yearOfPublication;

    public Book (String bookTitle, Author writer, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }


    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

