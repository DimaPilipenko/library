package com.example.library.model;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;
//    private LocalDateTime birthDate;
    private int phone;
    private String email;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

//    public LocalDateTime getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(LocalDateTime birthDate) {
//        this.birthDate = birthDate;
//    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
//                ", birthDate=" + birthDate +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
