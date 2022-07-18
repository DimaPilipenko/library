package com.example.library.dao;

import com.example.library.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
Author add (Author author);

Optional<Author> get(Long id);

List<Author> getAll();

Author update (Author author);

void delete(Long id);
}
