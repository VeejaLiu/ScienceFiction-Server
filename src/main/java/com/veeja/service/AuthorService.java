package com.veeja.service;

import com.veeja.dto.book.GetAllAuthorResult;
import com.veeja.pojo.Author;

public interface AuthorService {
    GetAllAuthorResult selectAll(Integer offset, Integer limit, String keyword);

    Author getAuthor(Author author);

    void updateAuthor(Author author);
}
