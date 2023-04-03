package com.veeja.controller;

import com.veeja.dto.author.GetAllAuthorResult;
import com.veeja.pojo.Author;
import com.veeja.service.AuthorService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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
     * @param offset  页码
     * @param limit   每页数量
     * @param keyword 关键字
     * @return 所有作者
     */
    @GetMapping(value = "", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public GetAllAuthorResult selectAll(@RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit, @RequestParam("keyword") String keyword) {
        return authorService.selectAll(offset, limit, keyword);
    }

    @PostMapping(value = "updateAuthor", produces = "application/json;charset=UTF-8")
    public String updateAuthor(@RequestBody Author author) {
        authorService.updateAuthor(author);
        return "success";
    }
}
