package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.ScienceFictionFile;

import java.util.List;

/**
 * 文件 Mapper 接口
 *
 * @author Veeja Liu
 */
public interface FileMapper extends BaseMapper<ScienceFictionFile> {
    /**
     * 查询所有文件
     *
     * @return List<ScienceFictionFile>
     */
    List<ScienceFictionFile> selectAll();

    /**
     * 根据id查询 文件
     *
     * @param id 文件id
     * @return ScienceFictionFile
     */
    ScienceFictionFile getOneById(Long id);
}