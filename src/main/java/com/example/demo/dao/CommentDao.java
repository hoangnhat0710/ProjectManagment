package com.example.demo.dao;

import com.example.demo.model.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao  extends CrudRepository<Comment, Long> {
}
