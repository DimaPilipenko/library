package com.example.library.controller;

import com.example.library.dto.request.AuthorRequestDto;
import com.example.library.dto.response.AuthorResponseDto;
import com.example.library.model.Author;
import com.example.library.service.AuthorService;
import com.example.library.service.mapper.AuthorMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/authors")
public class AuthorController {
   private final AuthorService authorService;
   private final AuthorMapper authorMapper;

    public AuthorController(AuthorService authorService,
                           AuthorMapper authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping
    public AuthorResponseDto add(@RequestBody AuthorRequestDto requestDto) {
        Author author = authorMapper.mapToModel(requestDto);
       authorService.add(author);
        return authorMapper.mapToDto(author);
    }

    @GetMapping
    public List<AuthorResponseDto> getAll() {
        return authorService.getAll()
                .stream()
                .map(authorMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AuthorResponseDto get(@PathVariable Long id) {
        return authorMapper.mapToDto(authorService.get(id));
    }

    @PutMapping("/{id}")
    public AuthorResponseDto update(@PathVariable Long id,
                                          @RequestBody AuthorRequestDto requestDto) {
        Author author = authorMapper.mapToModel(requestDto);
        author.setId(id);
        authorService.update(author);
        return authorMapper.mapToDto(author);
    }
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        authorService.delete(id);
//    }
}
