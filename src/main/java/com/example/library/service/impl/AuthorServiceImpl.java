package com.example.library.service.impl;

import com.example.library.dao.AuthorDao;
import com.example.library.model.Author;
import com.example.library.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author add(Author author) {
        return authorDao.add(author);
    }

    @Override
    public Author get(Long id) {
        return authorDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get author by id " + id));
    }

    @Override
    public List<Author> getAll() {
        return authorDao.getAll();
    }

    @Override
    public Author update(Author author) {
        return authorDao.update(author);
    }

    @Override
    public void delete(Long id) {
        authorDao.delete(id);
    }
}
