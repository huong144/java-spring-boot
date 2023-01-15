package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.models.Feedback;
import com.example.demo.repository.FeedbackRepository;

@Service
public class FeedbackService {
  @Autowired
  private FeedbackRepository feedbackRepository;

  public Page<Feedback> findAllPageable(Pageable pageable) {
    return feedbackRepository.findAll(pageable);
  }

  public Optional<Feedback> findById(int id) {
    return feedbackRepository.findById(id);
  }

  public List<Feedback> findAll() {
    return feedbackRepository.findAll();
  }

  public String create(Feedback feedback) {
    feedbackRepository.save(feedback);
    return "Success";
  }

  public String update(Feedback feedback) {
    feedbackRepository.save(feedback);
    return "Success";
  }
}
