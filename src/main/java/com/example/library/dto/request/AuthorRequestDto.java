package com.example.library.dto.request;

import java.time.LocalDateTime;

public class AuthorRequestDto {
    private String authorName;
    private LocalDateTime birthDate;
    private int phone;
    private String email;

    public AuthorRequestDto() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

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
        return "AuthorRequestDto{" +
                "authorName='" + authorName + '\'' +
                ", birthDate=" + birthDate +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
