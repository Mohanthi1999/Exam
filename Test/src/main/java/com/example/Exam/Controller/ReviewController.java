package com.example.Exam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exam.Dto.Review;
import com.example.Exam.Repository.ReviewRepository;

@RestController
@RequestMapping("/service/v1")
public class ReviewController {

	@Autowired
	private ReviewRepository repository;

	@PostMapping("/token")
	public ResponseEntity<Review> saveReview(@RequestBody Review review) {
		return new ResponseEntity<Review>(repository.save(review), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Review> getReview(@PathVariable("id") Long id) {
		return new ResponseEntity<Review>(HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		repository.findById(id);
		return new ResponseEntity<String>("delete successfully", HttpStatus.OK);

	}
}
