package com.veeja.dto.book;

import com.veeja.pojo.Book;

import java.util.List;

public class GetAllBookResult {

    // all books
    private List<GetAllBookResultBook> books;

    // total number of books
    private Long total;

    public List<GetAllBookResultBook> getBooks() {
        return books;
    }

    public void setBooks(List<GetAllBookResultBook> books) {
        this.books = books;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
