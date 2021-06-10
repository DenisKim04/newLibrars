package kg.Library.FirstSpringLesson.model.book;

public class Book {
    private long id;
    private String nameBook;
    private Author author;

    public Book() {
    }

    public Book(String nameBook, Author author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
