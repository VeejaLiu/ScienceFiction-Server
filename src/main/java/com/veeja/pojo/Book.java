package com.veeja.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "book")
public class Book {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "book_name")
    private String bookName;

    @TableField(value = "book_author")
    private Long bookAuthor;

    @TableField(value = "book_category")
    private Long bookCategory;

    @TableField(value = "book_tags")
    private String bookTags;

    @TableField(value = "book_images")
    private String bookImages;

    @TableField(value = "book_file_path")
    private Long bookFilePath;

    @TableField(value = "create_date")
    private Date createDate;

    @TableField(value = "update_date")
    private Date updateDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return book_name
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return book_author
     */
    public Long getBookAuthor() {
        return bookAuthor;
    }

    /**
     * @param bookAuthor
     */
    public void setBookAuthor(Long bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * @return book_category
     */
    public Long getBookCategory() {
        return bookCategory;
    }

    /**
     * @param bookCategory
     */
    public void setBookCategory(Long bookCategory) {
        this.bookCategory = bookCategory;
    }

    /**
     * @return book_tags
     */
    public String getBookTags() {
        return bookTags;
    }

    /**
     * @param bookTags
     */
    public void setBookTags(String bookTags) {
        this.bookTags = bookTags;
    }

    /**
     * @return book_images
     */
    public String getBookImages() {
        return bookImages;
    }

    /**
     * @param bookImages
     */
    public void setBookImages(String bookImages) {
        this.bookImages = bookImages;
    }

    /**
     * @return book_file_path
     */
    public Long getBookFilePath() {
        return bookFilePath;
    }

    /**
     * @param bookFilePath
     */
    public void setBookFilePath(Long bookFilePath) {
        this.bookFilePath = bookFilePath;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bookName='" + bookName + '\'' + ", bookAuthor=" + bookAuthor + ", bookCategory=" + bookCategory + ", bookTags='" + bookTags + '\'' + ", bookImages='" + bookImages + '\'' + ", bookFilePath=" + bookFilePath + ", createDate=" + createDate + ", updateDate=" + updateDate + '}';
    }
}