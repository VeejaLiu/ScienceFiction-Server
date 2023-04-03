package com.veeja.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.veeja.dto.author.GetAllAuthorResult;
import com.veeja.mapper.AuthorMapper;
import com.veeja.pojo.Author;
import com.veeja.service.AuthorService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorMapper authorMapper;

    @Override
    public GetAllAuthorResult selectAll(Integer offset, Integer limit, String keyword) {
        GetAllAuthorResult result = new GetAllAuthorResult();
        result.setAuthors(authorMapper.selectAll(offset, limit, keyword));
        Wrapper wrapper = Wrappers.<Author>lambdaQuery().like(StringUtils.isNotBlank(keyword), Author::getAuthorFirstName, keyword.toLowerCase()).or().like(StringUtils.isNotBlank(keyword), Author::getAuthorLastName, keyword.toLowerCase());
        result.setTotal(authorMapper.selectCount(wrapper));
        return result;
    }

    @Override
    public Author getAuthor(Author author) {
        Author existingAuthor = authorMapper.selectAuthorByFirstName(author.getAuthorFirstName());
        if (existingAuthor != null) {
            return existingAuthor;
        } else {
            authorMapper.insert(author);
            return author;

        }
    }

    @Override
    public void updateAuthor(Author author) {
        authorMapper.updateById(author);
    }
}
