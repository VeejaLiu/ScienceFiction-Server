package com.veeja.sevice.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.veeja.mapper.ScienceFictionAuthorMapper;
import com.veeja.pojo.ScienceFictionAuthor;
import com.veeja.sevice.ScienceFictionAuthorService;

@Service
public class ScienceFictionAuthorServiceImpl implements ScienceFictionAuthorService {

    @Resource
    private ScienceFictionAuthorMapper scienceFictionAuthorMapper;

    @Override
    public List<ScienceFictionAuthor> selectAll() {
        return scienceFictionAuthorMapper.selectAll();
    }
}
