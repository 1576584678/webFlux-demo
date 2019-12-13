package com.example.webfluxdemo.handler;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@Component
public class BlogTagHandler extends SqlSessionHandler {
    public BlogTagHandler(SqlSessionFactory factory) {
        super(factory);
    }
}
