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
public class BlogComment {
    private Long id;

    private Boolean adminComment;

    private String avatar;

    private String content;

    private Date createTime;

    private String email;

    private String nickname;

    private Long blogId;

    private Long parentCommentId;

}