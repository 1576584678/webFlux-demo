package com.example.webfluxdemo.common;
import com.github.pagehelper.PageInfo;
/**
 * @author liyuelin
 * @Desc 将分页信息封装到统一的接口
 * @Date 2019/12/13
 */
public class PageUtils {
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}