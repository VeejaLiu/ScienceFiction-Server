package com.veeja.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.mapper.FileMapper;
import com.veeja.service.ScienceFictionFileService;
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
