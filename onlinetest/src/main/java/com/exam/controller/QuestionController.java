package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Question;

import com.exam.service.QuestionService;

//allows to handle all REST APIs such as GET,post requests
@RestController

//used to map the http web request
@RequestMapping("/question")
public class QuestionController {

	// Autowired is to inject the dependancy into a bean
	// it will autowired all the beans into this class
	// it provide loose coupling
	@Autowired
	private QuestionService service;

	// add question, used to post request
	@PostMapping
	public Question add(@RequestBody Question question) {

		return this.service.addQuestion(question);
	}

	// get single question, used to fetch the record
	@GetMapping("/{quesId}")
	public Question get(@PathVariable("quesId") Long quesId) {

		return this.service.getQuestion(quesId);
	}

	// delete question, used to delete the record
	@DeleteMapping("/{quesId}")
	public void delete(@PathVariable("quesId") Long quesId) {

		this.service.deleteQuestion(quesId);
	}

	// find one question result
	@GetMapping("/result/{quesId}")
	public String getResult1(@PathVariable("quesId") Long quesId) {

		return this.service.getResult(quesId);

	}

	// find all question
	@GetMapping("/")
	public List<Question> getAllQuestion() {
		return this.service.getQuestions();
	}

}
