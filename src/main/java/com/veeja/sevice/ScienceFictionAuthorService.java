package com.veeja.sevice;

import com.veeja.pojo.ScienceFictionAuthor;

import java.util.List;

public interface ScienceFictionAuthorService {
    List<ScienceFictionAuthor> selectAll();
}
