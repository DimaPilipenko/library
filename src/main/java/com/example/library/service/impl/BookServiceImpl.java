package com.example.library.service.impl;

import com.example.library.dao.BookDao;
import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book add(Book book) {
        return bookDao.add(book);
    }

    @Override
    public Book get(Long id) {
        return bookDao.get(id).orElseThrow(
                () -> new RuntimeException("Can't get a book by id: " + id));
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public void delete(Long id) {
    bookDao.delete(id);
    }

    @Override
    public List<Book> getByAuthor(String authorName) {
        return bookDao.getByAuthor(authorName);
    }

    @Override
    public Book getMostSellingByAuthor(String authorName) {
        return bookDao.getMostSellingByAuthor(authorName).orElseThrow(
                () -> new RuntimeException("Can't get a book by author name: " + authorName)
        );
    }

    @Override
    public Book getMostPublishedByAuthor(String authorName) {
        return bookDao.getMostPublishedByAuthor(authorName).orElseThrow(
                () -> new RuntimeException("Can't get a book by author name: " + authorName)
        );
    }
}
