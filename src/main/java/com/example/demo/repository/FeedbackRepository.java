package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Feedback;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
// JpaRepository đã có 1 số hàm nó support sẵn kiểu findOne, findAll nên không cần viết thêm. Chỉ cần extend dùng luôn
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
  // Page<Feedback> findAll(Pageable pageable);
}
