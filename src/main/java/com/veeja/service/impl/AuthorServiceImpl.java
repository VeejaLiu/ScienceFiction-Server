package com.veeja.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.veeja.mapper.AuthorMapper;
import com.veeja.pojo.Author;
import com.veeja.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorMapper authorMapper;

    @Override
    public List<Author> selectAll() {
        return authorMapper.selectAll();
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
