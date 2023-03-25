package com.veeja.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.veeja.pojo.Book;

import java.util.List;

/**
 * 科幻小说Mapper
 *
 * @author
 * @since 2020-10-10
 */
public interface BookMapper extends BaseMapper<Book> {
    /**
     * 查询所有的科幻小说
     *
     * @return 所有的科幻小说
     */
    List<Book> selectAll(Integer offset, Integer limit);

    /**
     * 根据id查询科幻小说
     *
     * @param id id
     * @return 科幻小说
     */
    Book getOneById(Integer id);
}