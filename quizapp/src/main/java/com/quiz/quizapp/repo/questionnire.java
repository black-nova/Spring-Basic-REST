package com.quiz.quizapp.repo;

import com.quiz.quizapp.datamodel.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface questionnire extends JpaRepository<Students,Integer>  {
    
}
