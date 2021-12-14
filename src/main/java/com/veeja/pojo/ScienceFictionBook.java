package com.veeja.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Component;

@TableName(value = "SCIENCE_FICTION_BOOK")
@Component
public class ScienceFictionBook {
    @TableId(value = "id", type = IdType.INPUT)
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

    @TableField(value = "book_path")
    private String bookPath;

    public static final String COL_ID = "id";

    public static final String COL_BOOK_NAME = "book_name";

    public static final String COL_BOOK_AUTHOR = "book_author";

    public static final String COL_BOOK_CATEGORY = "book_category";

    public static final String COL_BOOK_TAGS = "book_tags";

    public static final String COL_BOOK_IMAGES = "book_images";

    public static final String COL_BOOK_PATH = "book_path";

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
     * @return book_path
     */
    public String getBookPath() {
        return bookPath;
    }

    /**
     * @param bookPath
     */
    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookAuthor=").append(bookAuthor);
        sb.append(", bookCategory=").append(bookCategory);
        sb.append(", bookTags=").append(bookTags);
        sb.append(", bookImages=").append(bookImages);
        sb.append(", bookPath=").append(bookPath);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScienceFictionBook other = (ScienceFictionBook) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookAuthor() == null ? other.getBookAuthor() == null : this.getBookAuthor().equals(other.getBookAuthor()))
            && (this.getBookCategory() == null ? other.getBookCategory() == null : this.getBookCategory().equals(other.getBookCategory()))
            && (this.getBookTags() == null ? other.getBookTags() == null : this.getBookTags().equals(other.getBookTags()))
            && (this.getBookImages() == null ? other.getBookImages() == null : this.getBookImages().equals(other.getBookImages()))
            && (this.getBookPath() == null ? other.getBookPath() == null : this.getBookPath().equals(other.getBookPath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookAuthor() == null) ? 0 : getBookAuthor().hashCode());
        result = prime * result + ((getBookCategory() == null) ? 0 : getBookCategory().hashCode());
        result = prime * result + ((getBookTags() == null) ? 0 : getBookTags().hashCode());
        result = prime * result + ((getBookImages() == null) ? 0 : getBookImages().hashCode());
        result = prime * result + ((getBookPath() == null) ? 0 : getBookPath().hashCode());
        return result;
    }
}