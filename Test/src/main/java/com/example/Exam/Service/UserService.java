package com.example.Exam.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exam.Dto.User;
import com.example.Exam.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public Optional<User> getUserId(Long long1) {

		Optional<User> user = repository.findById(long1);
		if (user.isPresent())
			return user;

		return null;
	}

	public User deleteById(Long id) {
		Optional<User> user = getUserId(id);
		if (user != null) {
			repository.delete(null);
		}
		return null;
	}
}
