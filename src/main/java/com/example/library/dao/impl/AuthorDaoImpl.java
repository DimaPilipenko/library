package com.example.library.dao.impl;

import com.example.library.dao.AbstractDao;
import com.example.library.dao.AuthorDao;
import com.example.library.model.Author;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImpl extends AbstractDao<Author> implements AuthorDao {

    public AuthorDaoImpl(SessionFactory factory) {
        super(factory, Author.class);
    }

}
