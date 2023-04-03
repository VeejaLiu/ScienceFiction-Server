package com.veeja.service;

import com.veeja.dto.author.GetAllAuthorResult;
import com.veeja.pojo.Author;

public interface AuthorService {
    GetAllAuthorResult selectAll(Integer offset, Integer limit, String keyword);

    Author getAuthor(Author author);

    void updateAuthor(Author author);
}
