package com.veeja.service.impl;

import com.veeja.mapper.FileMapper;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.ScienceFictionFileService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScienceFictionFileServiceImpl  implements ScienceFictionFileService{

    @Resource
    private FileMapper fileMapper;

    @Override
    public List<ScienceFictionFile> selectAll() {
        return fileMapper.selectAll();
    }

    @Override
    public ScienceFictionFile getOneById(Long id) {
        ScienceFictionFile file = fileMapper.getOneById(id);
        return file;
    }
}
