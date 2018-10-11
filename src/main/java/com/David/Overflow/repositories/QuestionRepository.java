package com.David.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.David.Overflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{
	List<Question> findAll();
}
