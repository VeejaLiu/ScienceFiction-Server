package com.veeja.controller;

import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.ScienceFictionFileService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("file")
public class FileController {
    @Resource
    private ScienceFictionFileService scienceFictionFileService;

    @GetMapping("getAllFile")
    @ResponseBody
    public List<ScienceFictionFile> selectAll() {
        List<ScienceFictionFile> files = scienceFictionFileService.selectAll();
        return files;
    }
}
