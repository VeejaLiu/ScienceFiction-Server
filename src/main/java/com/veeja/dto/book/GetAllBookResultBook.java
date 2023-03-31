package com.veeja.dto.book;

/**
 * bookID
 * bookName
 * bookAuthor
 * bookCategory
 * bookTags
 * bookDescription
 *
 * @author liuweijia
 */
public class GetAllBookResultBook {
    private String bookID;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private String bookTags;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookTags() {
        return bookTags;
    }

    public void setBookTags(String bookTags) {
        this.bookTags = bookTags;
    }
}
