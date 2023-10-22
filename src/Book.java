import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(writer, book.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, writer, yearOfPublication);
    }

    public String toString() {
        return "Автор: " + writer + ", книга: " + bookTitle + ", год издания: " + yearOfPublication;
    }
}

