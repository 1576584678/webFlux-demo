package com.example.webfluxdemo.handler;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@Component
public class BlogHandler extends SqlSessionHandler {
    public BlogHandler(SqlSessionFactory factory) {
        super(factory);
    }
}
