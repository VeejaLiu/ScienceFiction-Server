package com.veeja.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.veeja.mapper.ScienceFictionAuthorMapper;
import com.veeja.pojo.ScienceFictionAuthor;
import com.veeja.service.ScienceFictionAuthorService;

@Service
public class ScienceFictionAuthorServiceImpl implements ScienceFictionAuthorService {

    @Resource
    private ScienceFictionAuthorMapper scienceFictionAuthorMapper;

    @Override
    public List<ScienceFictionAuthor> selectAll() {
        return scienceFictionAuthorMapper.selectAll();
    }

    @Override
    public ScienceFictionAuthor getAuthor(ScienceFictionAuthor author) {
        ScienceFictionAuthor existingAuthor = scienceFictionAuthorMapper.selectAuthorByFirstName(author.getAuthorFirstName());
        if (existingAuthor != null) {
            return existingAuthor;
        } else {
            scienceFictionAuthorMapper.insert(author);
            return author;

        }
    }

    @Override
    public void updateAuthor(ScienceFictionAuthor author) {
        scienceFictionAuthorMapper.updateById(author);
    }
}
