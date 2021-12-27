package com.veeja.controller;

import com.veeja.dto.UploadBook;
import com.veeja.pojo.ScienceFictionBook;
import com.veeja.pojo.ScienceFictionFile;
import com.veeja.service.ScienceFictionBookService;
import com.veeja.service.ScienceFictionFileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author liuweijia
 */
@RestController
@RequestMapping("book")
public class ScienceFictionBookController {
    @Resource
    private ScienceFictionBookService scienceFictionBookService;

    @Resource
    private ScienceFictionFileService scienceFictionFileService;

    @GetMapping("getAllBook")
    @ResponseBody
    public List<ScienceFictionBook> selectAll() {
        List<ScienceFictionBook> books = scienceFictionBookService.selectAll();
        return books;
    }

    @PostMapping("uploadBook")
    public String uploadBook(UploadBook uploadBook) throws IOException {
        scienceFictionBookService.uploadBook(uploadBook);
        return "success";
    }

    @GetMapping("/downloadBook")
    public String downloadBook(String id) throws IOException {
        ScienceFictionFile scienceFictionFile = scienceFictionFileService.getFileInformationByBookId(id);

        // File file = new File(downloadFilePath +'/'+ fileName);
        // if(!file.exists()){
        //     return "下载文件不存在";
        // }
        // response.reset();
        // response.setContentType("application/octet-stream");
        // response.setCharacterEncoding("utf-8");
        // response.setContentLength((int) file.length());
        // response.setHeader("Content-Disposition", "attachment;filename=" + fileName );
        //
        // try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
        //     byte[] buff = new byte[1024];
        //     OutputStream os  = response.getOutputStream();
        //     int i = 0;
        //     while ((i = bis.read(buff)) != -1) {
        //         os.write(buff, 0, i);
        //         os.flush();
        //     }
        // } catch (IOException e) {
        //     log.error("{}",e);
        //     return "下载失败";
        // }
        return "下载成功";
    }
}
