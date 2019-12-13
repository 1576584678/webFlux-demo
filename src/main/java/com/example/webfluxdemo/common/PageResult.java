package com.example.webfluxdemo.common;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author liyuelin
 * @Desc 分页返回结果
 * @Date 2019/12/13
 */
@Getter
@Setter
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 数据模型
     */
    private List<?> content;
}
