package com.veeja.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadBook {
    private String book_name;
    private String book_author;
    private MultipartFile file;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
