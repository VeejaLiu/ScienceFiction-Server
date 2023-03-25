package com.veeja.service;

import com.veeja.dto.UploadBook;
import com.veeja.dto.book.GetAllBookResult;
import com.veeja.pojo.Book;

public interface BookService {
    GetAllBookResult selectAll(Integer offset, Integer limit);

    void uploadBook(UploadBook uploadBook);

    Book getOneById(Integer id);
}

