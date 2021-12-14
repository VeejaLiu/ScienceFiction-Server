package com.veeja.sevice.impl;

import com.veeja.mapper.ScienceFictionBookMapper;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.sevice.ScienceFictionBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScienceFictionBookServiceImpl implements ScienceFictionBookService {
    @Resource
    private ScienceFictionBookMapper scienceFictionBookMapper;

    @Override
    public List<ScienceFictionBook> selectAll() {
        return scienceFictionBookMapper.selectAll();
    }
}
