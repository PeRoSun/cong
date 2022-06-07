package com.congge.demo.service;

import com.congge.demo.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface ICommentService extends IService<Comment> {

    List<Comment> findCommentDetail(Integer articleId);
}
