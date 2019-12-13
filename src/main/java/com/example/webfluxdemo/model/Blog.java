package com.example.webfluxdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author liyuelin
 */
@Getter
@Setter
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

    public Blog(Long id, Boolean appreciation, Boolean commentabled, Date createTime, String description, String firstPicture, String flag, Boolean published, Boolean recommend, Boolean shareStatement, String title, Date updateTime, Integer views, Long typeId, Long userId) {
        this.id = id;
        this.appreciation = appreciation;
        this.commentabled = commentabled;
        this.createTime = createTime;
        this.description = description;
        this.firstPicture = firstPicture;
        this.flag = flag;
        this.published = published;
        this.recommend = recommend;
        this.shareStatement = shareStatement;
        this.title = title;
        this.updateTime = updateTime;
        this.views = views;
        this.typeId = typeId;
        this.userId = userId;
    }

    public Blog(Long id, Boolean appreciation, Boolean commentabled, Date createTime, String description, String firstPicture, String flag, Boolean published, Boolean recommend, Boolean shareStatement, String title, Date updateTime, Integer views, Long typeId, Long userId, String content) {
        this.id = id;
        this.appreciation = appreciation;
        this.commentabled = commentabled;
        this.createTime = createTime;
        this.description = description;
        this.firstPicture = firstPicture;
        this.flag = flag;
        this.published = published;
        this.recommend = recommend;
        this.shareStatement = shareStatement;
        this.title = title;
        this.updateTime = updateTime;
        this.views = views;
        this.typeId = typeId;
        this.userId = userId;
        this.content = content;
    }

}