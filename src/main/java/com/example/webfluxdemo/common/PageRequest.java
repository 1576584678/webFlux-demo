package com.example.webfluxdemo.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liyuelin
 * @Desc 分页请求
 * @Date 2019/12/13
 */
@Setter
@Getter
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;

}
