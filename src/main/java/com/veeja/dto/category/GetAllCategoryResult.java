package com.veeja.dto.category;

import com.veeja.pojo.Category;

import java.util.List;

public class GetAllCategoryResult {
    private List<Category> categories;

    private Long total;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
