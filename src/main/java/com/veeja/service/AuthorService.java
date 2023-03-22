package com.veeja.service;

import com.veeja.pojo.Author;

import java.util.List;

public interface AuthorService {
    List<Author> selectAll();

    Author getAuthor(Author author);

    void updateAuthor(Author author);
}
