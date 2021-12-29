package com.veeja.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.mapper.ScienceFictionFileMapper;
import com.veeja.service.ScienceFictionFileService;
@Service
public class ScienceFictionFileServiceImpl  implements ScienceFictionFileService{

    @Resource
    private ScienceFictionFileMapper scienceFictionFileMapper;

    @Override
    public List<ScienceFictionFile> selectAll() {
        return scienceFictionFileMapper.selectAll();
    }

    @Override
    public ScienceFictionFile getOneById(Long id) {
        ScienceFictionFile file = scienceFictionFileMapper.getOneById(id);
        return file;
    }
}
