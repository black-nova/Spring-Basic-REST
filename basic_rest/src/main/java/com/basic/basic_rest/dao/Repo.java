package com.basic.basic_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.basic_rest.model.student_data;

@Repository
public interface Repo extends JpaRepository<student_data,Integer> {
    
}
