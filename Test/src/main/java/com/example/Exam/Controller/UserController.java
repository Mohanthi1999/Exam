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

import com.example.Exam.Dto.User;
import com.example.Exam.Service.UserService;

@RestController
@RequestMapping("/service/v1")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/review")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return new ResponseEntity<User>(service.saveUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/review/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	@DeleteMapping("/review/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
	}
}
