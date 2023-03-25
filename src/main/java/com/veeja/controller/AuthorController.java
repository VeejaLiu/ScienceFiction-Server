package com.veeja.controller;

import com.veeja.pojo.Author;
import com.veeja.service.AuthorService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liuweijia
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("authors")
public class AuthorController {
    @Resource
    private AuthorService authorService;

    /**
     * 查询所有作者
     *
     * @return 所有作者
     */
    @GetMapping(value = "", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Author> selectAll() {
        List<Author> authors = authorService.selectAll();
        return authors;
    }

    @PostMapping(value = "updateAuthor", produces = "application/json;charset=UTF-8")
    public String updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
        return "success";
    }
}
