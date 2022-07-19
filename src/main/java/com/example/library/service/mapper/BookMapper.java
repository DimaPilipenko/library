package com.example.library.service.mapper;

import com.example.library.dto.request.BookRequestDto;
import com.example.library.dto.response.BookResponseDto;
import com.example.library.model.Book;
import com.example.library.service.AuthorService;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements RequestDtoMapper<BookRequestDto, Book>,
        ResponseDtoMapper<BookResponseDto, Book>{
    private final AuthorService authorService;

    public BookMapper(AuthorService authorService) {
        this.authorService = authorService;
    }


    @Override
    public Book mapToModel(BookRequestDto dto) {
        Book book = new Book();
        book.setBookName(dto.getBookName());
        book.setPublishedAmount(dto.getPublishedAmount());
        book.setSoldAmount(dto.getSoldAmount());
        book.setAuthor(authorService.get(dto.getAuthorId()));
        return book;
    }

    @Override
    public BookResponseDto mapToDto(Book book) {
        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setId(book.getId());
        bookResponseDto.setBookName(book.getBookName());
        bookResponseDto.setPublishedAmount(book.getPublishedAmount());
        bookResponseDto.setSoldAmount(book.getSoldAmount());
        bookResponseDto.setAuthorId(book.getAuthor().getId());
        return bookResponseDto;
    }
}
