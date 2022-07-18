package com.example.library.dto.response;

import javax.persistence.*;

public class BookResponseDto {
    private Long id;
    private String bookName;
    private Long authorId;
    private Long publishedAmount;
    private Long soldAmount;

    public BookResponseDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "BookResponseDto{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorId=" + authorId +
                ", publishedAmount=" + publishedAmount +
                ", soldAmount=" + soldAmount +
                '}';
    }
}
