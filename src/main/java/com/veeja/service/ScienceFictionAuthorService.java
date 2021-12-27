package com.veeja.service;

import com.veeja.pojo.ScienceFictionAuthor;

import java.util.List;

public interface ScienceFictionAuthorService {
    List<ScienceFictionAuthor> selectAll();

    ScienceFictionAuthor getAuthor(ScienceFictionAuthor author);

    void updateAuthor(ScienceFictionAuthor author);
}
