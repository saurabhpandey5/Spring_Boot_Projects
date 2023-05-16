package com.exam.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Question;
import com.exam.repo.QuestionRepository;
import com.exam.service.QuestionService;

//class contains business logic
@Service
public class QuestionServiceImpl implements QuestionService {

	//it will autowired all the beans into this class
	//it provide loose coupling
	@Autowired
	private QuestionRepository questionRepository;

	// Adding the question
	@Override
	public Question addQuestion(Question question) {

		return this.questionRepository.save(question);
	}

	// Get question using questionId
	@Override
	public Question getQuestion(Long questionId) {

		return this.questionRepository.findById(questionId).get();
	}

	// Delete the question using questionId
	@Override
	public void deleteQuestion(Long quesId) {
		Question question = new Question();
		question.setQuesId(quesId);
		this.questionRepository.delete(question);

	}

	// get all question
	@Override
	public List<Question> getQuestions() {
		return this.questionRepository.findAll();
	}

	// get the result of the user
	@Override
	public String getResult(Long questionId) {

		String givenAns = this.questionRepository.findById(questionId).get().getAnswer();
		String correctAns = this.questionRepository.findById(questionId).get().getGivenAnswer();
		if (correctAns.equals(givenAns)) {

			return "yes";
		} else {
			return "No";
		}

	}

}
