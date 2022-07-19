package com.example.library.service;

import com.example.library.model.Book;

import java.util.List;

public interface BookService {
    Book add (Book book);

    Book get(Long id);

    List<Book> getAll();

    Book update (Book book);

    void delete(Long id);

    List<Book> getByAuthor(String authorName);

    Book getMostSellingByAuthor(String authorName);

    Book getMostPublishedByAuthor(String authorName);
}
