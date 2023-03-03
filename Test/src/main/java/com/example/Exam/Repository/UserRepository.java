package com.example.Exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Exam.Dto.Review;
import com.example.Exam.Dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
