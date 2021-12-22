package com.veeja.sevice;

import com.veeja.pojo.ScienceFictionFile;

import java.util.List;

public interface ScienceFictionFileService {

    List<ScienceFictionFile> selectAll();

    ScienceFictionFile getFileInformationByBookId(String id);
}
