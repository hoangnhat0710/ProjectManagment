package com.example.demo.dao;

import com.example.demo.model.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends CrudRepository<Project, Long> {
}
