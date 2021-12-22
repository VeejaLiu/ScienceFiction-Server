package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionFile;

import java.util.List;

public interface ScienceFictionFileMapper extends BaseMapper<ScienceFictionFile> {
    List<ScienceFictionFile> selectAll();

    ScienceFictionFile getFileInformationByBookId(String id);
}