package com.example.library.service;

import com.example.library.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Author add (Author author);

    Author get(Long id);

    List<Author> getAll();

    Author update (Author author);

    void delete(Long id);
}
