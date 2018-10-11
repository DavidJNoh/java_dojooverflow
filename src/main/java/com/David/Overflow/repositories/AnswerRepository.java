package com.David.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.David.Overflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
	List<Answer> findAll();
	
}
