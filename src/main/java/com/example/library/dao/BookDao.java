package com.example.library.dao;

import com.example.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    Book add (Book book);

    Optional<Book> get(Long id);

    List<Book> getAll();

    Book update (Book book);

    void delete(Long id);

    List<Book> getByAuthor(String authorName);
    Optional<Book> getMostSellingByAuthor(String authorName);

    Optional<Book> getMostPublishedByAuthor(String authorName);
}
