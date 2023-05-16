package com.exam.service;

import java.util.List;

import com.exam.model.Question;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question getQuestion(Long questionId);

	public void deleteQuestion(Long quesId);

	public List<Question> getQuestions();

	public String getResult(Long questionId);
}
