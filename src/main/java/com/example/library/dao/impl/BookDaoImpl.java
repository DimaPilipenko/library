package com.example.library.dao.impl;

import com.example.library.dao.AbstractDao;
import com.example.library.dao.BookDao;
import com.example.library.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl extends AbstractDao<Book> implements BookDao {
    public BookDaoImpl(SessionFactory factory) {
        super(factory, Book.class);
    }
}
