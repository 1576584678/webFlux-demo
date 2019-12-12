package com.example.webfluxdemo.handler;

import com.example.webfluxdemo.model.BlogUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.sql.SQLException;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/12
 */
@Component
public class BlogUserHandler extends SqlSessionHandler{
    public BlogUserHandler(SqlSessionFactory factory) {
        super(factory);
    }

    public Mono<BlogUser> findBlogUserById(Long id) {
        String sqlId=String.format(pageNameSpace, "BlogUser", "selectByPrimaryKey");
        SqlSession sqlSession;
        BlogUser blogUser=null;
        try {
            sqlSession = getSqlSession();
            blogUser=sqlSession.selectOne(sqlId,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Mono.justOrEmpty(blogUser);
    }
}
