package com.example.webfluxdemo.controller;

import com.example.webfluxdemo.handler.BlogUserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@RestController
@RequestMapping(value = "/blogUser")
public class BlogUserController {
    private final
    BlogUserHandler blogUserHandler;

    @Autowired
    public BlogUserController(BlogUserHandler blogUserHandler) {
        this.blogUserHandler = blogUserHandler;
    }


    @PostMapping(value = "/get")
    public Mono findBlogUserById(@RequestBody Map params) {
        return blogUserHandler.findByUsernameAndPassword(params);
    }
}
