package com.example.demo.dao;

import com.example.demo.model.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends CrudRepository<Department, Long> {
}
