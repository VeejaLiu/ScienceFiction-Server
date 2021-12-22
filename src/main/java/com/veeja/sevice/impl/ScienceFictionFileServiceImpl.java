package com.veeja.sevice.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.mapper.ScienceFictionFileMapper;
import com.veeja.sevice.ScienceFictionFileService;
@Service
public class ScienceFictionFileServiceImpl  implements ScienceFictionFileService{

    @Resource
    private ScienceFictionFileMapper scienceFictionFileMapper;

    @Override
    public List<ScienceFictionFile> selectAll() {
        return scienceFictionFileMapper.selectAll();
    }

    @Override
    public ScienceFictionFile getFileInformationByBookId(String id) {
        ScienceFictionFile file = scienceFictionFileMapper.getFileInformationByBookId(id);
        return file;
    }
}
