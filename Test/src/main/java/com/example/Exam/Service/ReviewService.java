package com.example.Exam.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Exam.Dto.Review;
import com.example.Exam.Repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repository;

	public Review saveReview(Review review) {
		return repository.save(review);
	}
	
	public List<Review> getReview(Long id) {
		Optional<Review> optional=repository.findById(id);
		
		return (List<Review>) repository.findById(id).orElseThrow(()-> new NullPointerException("Data Not Found"));
	}
	
	public void delete(Long id) {
		Review employees = repository.findById(id).orElseThrow(() -> new NullPointerException("Data Not Found"));
		repository.delete(employees);
	}
}
