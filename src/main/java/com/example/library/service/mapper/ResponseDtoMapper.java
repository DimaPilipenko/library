package com.example.library.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
