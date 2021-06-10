package kg.Library.FirstSpringLesson.model.book;
public class Genre {
    private long id;
    private String nameGenre;
    private Book book;

    public Genre() {
    }

    public Genre(String nameGenre, Book book) {
        this.nameGenre = nameGenre;
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}