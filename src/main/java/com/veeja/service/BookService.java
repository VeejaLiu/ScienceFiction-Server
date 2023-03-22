package com.veeja.service;

import com.veeja.dto.UploadBook;
import com.veeja.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> selectAll();

    void uploadBook(UploadBook uploadBook);

    Book getOneById(Integer id);
}

