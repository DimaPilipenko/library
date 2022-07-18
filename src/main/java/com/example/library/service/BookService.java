package com.example.library.service;

import com.example.library.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book add (Book book);

    Book get(Long id);

    List<Book> getAll();

    Book update (Book book);

    void delete(Long id);
}
