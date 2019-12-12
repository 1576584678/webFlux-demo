package com.example.webfluxdemo.handler;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@Service
public class BlogHandler extends SqlSessionHandler {
    public BlogHandler(SqlSessionFactory factory) {
        super(factory);
    }
}
