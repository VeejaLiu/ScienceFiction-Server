package com.veeja.sevice;

import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionCategory;

import java.util.List;

public interface ScienceFictionCategoryService{

    List<ScienceFictionCategory> selectAll();

}
