package com.example.Exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Exam.Dto.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {


}
