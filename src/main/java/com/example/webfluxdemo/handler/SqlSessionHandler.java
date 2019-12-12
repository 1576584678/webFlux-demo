package com.example.webfluxdemo.handler;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/12/10
 */
public class SqlSessionHandler {


    private final
    SqlSessionFactory factory;
    String pageNameSpace = "com.example.webfluxdemo.mapper.%sMapper.%s";

    @Autowired
    public SqlSessionHandler(SqlSessionFactory factory) {
        this.factory = factory;
    }

    SqlSession getSqlSession() throws SQLException {
        SqlSession session = factory.openSession();
        session.getConnection().setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        return session;
    }

}
