package com.example.library.dto.request;

import com.example.library.model.Author;

import javax.persistence.*;

public class BookRequestDto {
    private String bookName;
    private Long authorId;
    private Long publishedAmount;
    private Long soldAmount;

    public BookRequestDto() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getPublishedAmount() {
        return publishedAmount;
    }

    public void setPublishedAmount(Long publishedAmount) {
        this.publishedAmount = publishedAmount;
    }

    public Long getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Long soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String toString() {
        return "BookRequestDto{" +
                "bookName='" + bookName + '\'' +
                ", authorId=" + authorId +
                ", publishedAmount=" + publishedAmount +
                ", soldAmount=" + soldAmount +
                '}';
    }
}
