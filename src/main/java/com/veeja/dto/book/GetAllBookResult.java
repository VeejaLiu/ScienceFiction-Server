package com.veeja.dto.book;

import com.veeja.pojo.Book;

import java.util.List;

public class GetAllBookResult {

    // all books
    private List<Book> books;

    // total number of books
    private Long total;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
