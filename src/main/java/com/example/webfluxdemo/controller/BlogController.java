package com.example.webfluxdemo.controller;

import com.example.webfluxdemo.common.PageRequest;
import com.example.webfluxdemo.common.PageResult;
import com.example.webfluxdemo.common.PageUtils;
import com.example.webfluxdemo.handler.BlogHandler;
import com.example.webfluxdemo.model.Blog;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/13
 */
@RestController
@RequestMapping(value = "/blog")
public class BlogController {
    private final
    BlogHandler blogHandler;

    @Autowired
    public BlogController(BlogHandler blogHandler) {
        this.blogHandler = blogHandler;
    }

    @PostMapping(value = "top")
    public Mono findTop(@RequestBody PageRequest pageRequest){
        PageInfo<Blog> pageInfo=blogHandler.findTop(pageRequest);
        PageResult pageResult = PageUtils.getPageResult(pageRequest,pageInfo);
        return Mono.justOrEmpty(pageResult);
    }
}
