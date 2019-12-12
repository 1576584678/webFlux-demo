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
public class BlogUser {
    private Long id;

    private String avatar;

    private Date createTime;

    private String email;

    private String nickname;

    private String password;

    private Integer type;

    private Date updateTime;

    private String username;

}