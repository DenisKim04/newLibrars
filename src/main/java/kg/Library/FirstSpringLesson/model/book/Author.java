package kg.Library.FirstSpringLesson.model.book;

public class Author {
    private long id;
    private String name;
    private String surname;
    private Book book;

    public Author() {
    }

    public Author(String name, String surname, Book book) {
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
