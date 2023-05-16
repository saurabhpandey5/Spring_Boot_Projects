package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.model.Question;

//JpaRepository is spring data interface for generic crud operation
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
