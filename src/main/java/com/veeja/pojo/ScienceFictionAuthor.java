package com.veeja.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

@TableName(value = "SCIENCE_FICTION_AUTHOR")
public class ScienceFictionAuthor {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "author_first_name")
    private String authorFirstName;

    @TableField(value = "author_last_name")
    private String authorLastName;

    @TableField(value = "author_nation")
    private String authorNation;

    @TableField(value = "author_informations")
    private String authorInformations;

    @TableField(value = "is_deleted")
    private Integer isDeleted;

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
     * @return author_first_name
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * @param authorFirstName
     */
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    /**
     * @return author_last_name
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * @param authorLastName
     */
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    /**
     * @return author_nation
     */
    public String getAuthorNation() {
        return authorNation;
    }

    /**
     * @param authorNation
     */
    public void setAuthorNation(String authorNation) {
        this.authorNation = authorNation;
    }

    /**
     * @return author_informations
     */
    public String getAuthorInformations() {
        return authorInformations;
    }

    /**
     * @param authorInformations
     */
    public void setAuthorInformations(String authorInformations) {
        this.authorInformations = authorInformations;
    }

    /**
     * @return is_deleted
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", authorFirstName=").append(authorFirstName);
        sb.append(", authorLastName=").append(authorLastName);
        sb.append(", authorNation=").append(authorNation);
        sb.append(", authorInformations=").append(authorInformations);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
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
        ScienceFictionAuthor other = (ScienceFictionAuthor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAuthorFirstName() == null ? other.getAuthorFirstName() == null : this.getAuthorFirstName().equals(other.getAuthorFirstName()))
                && (this.getAuthorLastName() == null ? other.getAuthorLastName() == null : this.getAuthorLastName().equals(other.getAuthorLastName()))
                && (this.getAuthorNation() == null ? other.getAuthorNation() == null : this.getAuthorNation().equals(other.getAuthorNation()))
                && (this.getAuthorInformations() == null ? other.getAuthorInformations() == null : this.getAuthorInformations().equals(other.getAuthorInformations()))
                && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAuthorFirstName() == null) ? 0 : getAuthorFirstName().hashCode());
        result = prime * result + ((getAuthorLastName() == null) ? 0 : getAuthorLastName().hashCode());
        result = prime * result + ((getAuthorNation() == null) ? 0 : getAuthorNation().hashCode());
        result = prime * result + ((getAuthorInformations() == null) ? 0 : getAuthorInformations().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}