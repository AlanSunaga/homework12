import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearPub;



    public Book(String nameBook, Author author, int yearPub) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPub = yearPub;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPub == book.yearPub && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPub);
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + "\n" + "Автор: " + author + "\n" + "Год публикации: " + yearPub;
    }
}
