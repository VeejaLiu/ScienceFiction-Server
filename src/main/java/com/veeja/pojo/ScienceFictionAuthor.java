package com.veeja.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "SCIENCE_FICTION_AUTHOR")
public class ScienceFictionAuthor {
    public static final String COL_ID = "id";
    public static final String COL_AUTHOR_FIRST_NAME = "author_first_name";
    public static final String COL_AUTHOR_LAST_NAME = "author_last_name";
    public static final String COL_AUTHOR_NATION = "author_nation";
    public static final String COL_AUTHOR_INFORMATIONS = "author_informations";
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
                && (this.getAuthorInformations() == null ? other.getAuthorInformations() == null : this.getAuthorInformations().equals(other.getAuthorInformations()));
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
        return result;
    }
}