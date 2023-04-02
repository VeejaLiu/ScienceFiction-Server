package com.veeja.dto.book;

import com.veeja.pojo.Author;

import java.util.List;

public class GetAllAuthorResult {
    private List<Author> authors;

    private Long total;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
