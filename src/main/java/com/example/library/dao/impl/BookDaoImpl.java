package com.example.library.dao.impl;

import com.example.library.dao.AbstractDao;
import com.example.library.dao.BookDao;
import com.example.library.exception.DataProcessingException;
import com.example.library.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class BookDaoImpl extends AbstractDao<Book> implements BookDao {
    public BookDaoImpl(SessionFactory factory) {
        super(factory, Book.class);
    }

    @Override
    public Optional<Book> getMostSellingByAuthor(String authorName) {
        try (Session session = factory.openSession()) {
            Query<Book> getMostSellingByAuthor = session.createQuery(
                    "FROM Book b JOIN FETCH b.authors WHERE b.authorName = :authorName AND " +
                            " soldAmount = (SELECT MAX(soldAmount) FROM Book) ",
                    Book.class);
            getMostSellingByAuthor.setParameter("authorName", authorName);
            return getMostSellingByAuthor.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find books by authorName "
                    + authorName, e);
        }
    }

    @Override
    public Optional<Book> getMostPublishedByAuthor(String authorName) {
        try (Session session = factory.openSession()) {
            Query<Book> getMostPublishedByAuthor = session.createQuery(
                    "FROM Book b JOIN FETCH b.authors WHERE b.authorName = :authorName AND " +
                            " publishedAmount = (SELECT MAX(publishedAmount) FROM Book) ",
                    Book.class);
            getMostPublishedByAuthor.setParameter("authorName", authorName);
            return getMostPublishedByAuthor.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find books by authorName "
                    + authorName, e);
        }
    }

    @Override
    public List<Book> getByAuthor(String authorName) {
        try (Session session = factory.openSession()) {
            Query<Book> getByAuthor = session.createQuery(
                    "FROM Book b JOIN FETCH b.authors WHERE b.authorName = :authorName",
                Book.class);
            getByAuthor.setParameter("authorName", authorName);
            return getByAuthor.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find books by authorName "
                    + authorName, e);
        }
    }
}
