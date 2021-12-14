package com.veeja.sevice;

import com.veeja.pojo.ScienceFictionBook;

import java.util.List;

public interface ScienceFictionBookService {
    List<ScienceFictionBook> selectAll();
}
