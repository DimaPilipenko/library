package com.example.library.controller;

import com.example.library.dto.request.BookRequestDto;
import com.example.library.dto.response.BookResponseDto;
import com.example.library.model.Book;
import com.example.library.service.BookService;
import com.example.library.service.mapper.BookMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {
   private final BookService bookService;
   private final BookMapper bookMapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }


    @PostMapping
    public BookResponseDto add(@RequestBody BookRequestDto requestDto) {
        Book book = bookMapper.mapToModel(requestDto);
       bookService.add(book);
        return bookMapper.mapToDto(book);
    }

    @GetMapping
    public List<BookResponseDto> getAll() {
        return bookService.getAll()
                .stream()
                .map(bookMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookResponseDto get(@PathVariable Long id) {
        return bookMapper.mapToDto(bookService.get(id));
    }

    @PutMapping("/{id}")
    public BookResponseDto update(@PathVariable Long id,
                                          @RequestBody BookRequestDto requestDto) {
        Book book = bookMapper.mapToModel(requestDto);
        book.setId(id);
        bookService.update(book);
        return bookMapper.mapToDto(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

    @GetMapping("/by-author")
    public List<Book> getByAuthor(@RequestParam String authorName) {
        return bookService.getByAuthor(authorName);
    }

    @GetMapping("/by-author/most-selling")
    public BookResponseDto getMostSellingByAuthor(@RequestParam String authorName) {
        return bookMapper.mapToDto(bookService.getMostSellingByAuthor(authorName));
    }

    @GetMapping("/by-author/most-published")
    public BookResponseDto getMostPublishedByAuthor(@RequestParam String authorName) {
        return bookMapper.mapToDto(bookService.getMostPublishedByAuthor(authorName));
    }
}
