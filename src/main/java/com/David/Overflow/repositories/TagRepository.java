package com.David.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.David.Overflow.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{
	List<Tag> findAll();
	
}
