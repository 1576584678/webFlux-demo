package com.example.webfluxdemo.controller;

import com.example.webfluxdemo.handler.BlogUserHandler;
import com.example.webfluxdemo.model.BlogUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@RestController
@RequestMapping(value = "/blogUser")
public class BlogUserController {
    private static Logger logger = LoggerFactory.getLogger(BlogUserController.class);
    private final
    BlogUserHandler blogUserHandler;

    @Autowired
    public BlogUserController(BlogUserHandler blogUserHandler) {
        this.blogUserHandler = blogUserHandler;
    }


    @GetMapping(value = "/{username}")
    public Mono<BlogUser> findBlogUserById(@PathVariable("username") String username) {
        logger.info("get: /"+username);
        return blogUserHandler.findByUsernameAndPassword(username);
    }
}
