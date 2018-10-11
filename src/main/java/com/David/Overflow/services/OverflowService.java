package com.David.Overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.David.Overflow.models.Answer;
import com.David.Overflow.models.Question;
import com.David.Overflow.models.Tag;
import com.David.Overflow.repositories.AnswerRepository;
import com.David.Overflow.repositories.QuestionRepository;
import com.David.Overflow.repositories.TagRepository;

@Service
public class OverflowService {
	private final AnswerRepository answerRepo;
	private final QuestionRepository questionRepo;
	private final TagRepository tagRepo;
	
	public OverflowService(AnswerRepository get, QuestionRepository baited, TagRepository LUL) {
		this.answerRepo = get;
		this.questionRepo = baited;
		this.tagRepo = LUL;
	}
	
	public Question createQuestion(Question x) {
		return questionRepo.save(x);
	}
	
	public Tag createTag(Tag x) {
		return tagRepo.save(x);
	}
	
	public Answer createAnswer(Answer x) {
		return answerRepo.save(x);
	}
	
	public List<Question> allQuestions(){
		return questionRepo.findAll();
	}
	
	public Question getQuestion(Long id) {
		Optional<Question> maybe = questionRepo.findById(id);
		if(maybe.isPresent()) {
			return maybe.get();
		}
		else {
			return null;
		}
	}
	
}
