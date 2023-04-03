package com.veeja.service;

import com.veeja.dto.category.GetAllCategoryResult;

public interface CategoryService {

    GetAllCategoryResult selectAll(Integer offset, Integer limit, String keyword);

}
