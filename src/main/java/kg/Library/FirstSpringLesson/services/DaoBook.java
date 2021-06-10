package kg.Library.FirstSpringLesson.services;

import kg.Library.FirstSpringLesson.model.book.Author;
import kg.Library.FirstSpringLesson.model.book.Book;
import kg.Library.FirstSpringLesson.model.book.Genre;

public interface DaoBook {
    boolean saveBook(Book book, Author author, Genre genre);
    boolean checkBook();
}
