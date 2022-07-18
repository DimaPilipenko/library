package com.example.library.service.mapper;

import com.example.library.dto.request.AuthorRequestDto;
import com.example.library.dto.response.AuthorResponseDto;
import com.example.library.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper implements RequestDtoMapper<AuthorRequestDto, Author>,
        ResponseDtoMapper<AuthorResponseDto, Author>{

    @Override
    public Author mapToModel(AuthorRequestDto dto) {
        Author author = new Author();
        author.setAuthorName(dto.getAuthorName());
        author.setBirthSate(dto.getBirthDate());
        author.setPhone(dto.getPhone());
        author.setEmail(dto.getEmail());
        return author;
    }

    @Override
    public AuthorResponseDto mapToDto(Author author) {
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        authorResponseDto.setId(author.getId());
        authorResponseDto.setAuthorName(authorResponseDto.getAuthorName());
        authorResponseDto.setBirthDate(author.getBirthSate());
        authorResponseDto.setPhone(author.getPhone());
        authorResponseDto.setEmail(author.getEmail());
        return authorResponseDto;
    }
}
