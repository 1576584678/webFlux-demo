package com.example.webfluxdemo.handler;

import com.example.webfluxdemo.common.PageRequest;
import com.example.webfluxdemo.model.Blog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

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

    public PageInfo<Blog> findTop(PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        String sqlId=String.format(pageNameSpace, "Blog", "findTop");
        SqlSession sqlSession = null;
        List<Blog> blogs=null;
        try {
            sqlSession = getSqlSession();
            blogs=sqlSession.selectList(sqlId);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return new PageInfo<>(blogs);
    }

    public PageInfo<Blog> findByQuery(String query, PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        String sqlId=String.format(pageNameSpace, "Blog", "findByQuery");
        SqlSession sqlSession = null;
        List<Blog> blogs=null;
        try {
            sqlSession = getSqlSession();
            blogs=sqlSession.selectList(sqlId,query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return new PageInfo<>(blogs);
    }

    @Transactional
    public int updateViews(Long id){
        String sqlId=String.format(pageNameSpace, "Blog", "updateViews");
        SqlSession sqlSession = null;
        int n=0;
        try {
            sqlSession = getSqlSession();
            n=sqlSession.update(sqlId,id);
            sqlSession.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return n;
    }

    public List<String> findGroupYear(){
        String sqlId=String.format(pageNameSpace, "Blog", "findGroupYear");
        SqlSession sqlSession = null;
        List<String> years = null;
        try {
            sqlSession = getSqlSession();
            years=sqlSession.selectList(sqlId);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return years;
    }

    public PageInfo<Blog> findByYear(String year,PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        String sqlId=String.format(pageNameSpace, "Blog", "findByYear");
        SqlSession sqlSession = null;
        List<Blog> blogs = null;
        try {
            sqlSession = getSqlSession();
            blogs=sqlSession.selectList(sqlId,year);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return new PageInfo<>(blogs);
    }

    public String viewContentById(Integer id){
        String sqlId=String.format(pageNameSpace, "Blog", "viewContentById");
        SqlSession sqlSession = null;
        String content = null;
        try {
            sqlSession = getSqlSession();
            content = sqlSession.selectOne(sqlId, id);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return content;
    }
}
