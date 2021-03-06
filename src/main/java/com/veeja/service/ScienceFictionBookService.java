package com.veeja.service;

import com.veeja.dto.UploadBook;
import com.veeja.pojo.ScienceFictionBook;

import java.util.List;

public interface ScienceFictionBookService {
    List<ScienceFictionBook> selectAll();

    void uploadBook(UploadBook uploadBook);

    ScienceFictionBook getOneById(Integer id);
}

