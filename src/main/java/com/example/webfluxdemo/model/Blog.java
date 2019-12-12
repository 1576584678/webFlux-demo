package com.example.webfluxdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author liyuelin
 */
@Getter
@Setter
@AllArgsConstructor
public class Blog {
    private Long id;

    private Boolean appreciation;

    private Boolean commentabled;

    private Date createTime;

    private String description;

    private String firstPicture;

    private String flag;

    private Boolean published;

    private Boolean recommend;

    private Boolean shareStatement;

    private String title;

    private Date updateTime;

    private Integer views;

    private Long typeId;

    private Long userId;

    private String content;

}