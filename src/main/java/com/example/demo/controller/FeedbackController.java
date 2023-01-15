package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Feedback;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.DataResponse;
import com.example.demo.response.MessageResponse;
import com.example.demo.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
  @Autowired
  private FeedbackService feedbackService;

  // http://localhost:8081/api/v1/feedback?page=1&size=1
  @GetMapping
  public BaseResponse findAll(@RequestParam("page") Optional<Integer> page,
      @RequestParam("size") Optional<Integer> size) {
    try {
      int currentPage = page.orElse(1);
      int pageSize = size.orElse(10);
      Pageable pageable = PageRequest.of(currentPage - 1, pageSize);
      Page<Feedback> feedbackPage = feedbackService.findAllPageable(pageable);
      List<Feedback> feedbacks = feedbackPage.getContent();
      return new DataResponse(true, feedbacks, feedbackService.findAll().size());
    } catch (Exception e) {
      return new MessageResponse("false");
    }
  }

  @PostMapping
  public BaseResponse create(@RequestBody Feedback feedback) {
    try {
      return new MessageResponse(true, feedbackService.create(feedback));
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  @GetMapping("/{id}")
  public Optional<Feedback> findById(@PathVariable("id") Integer id) {
    try {
      return feedbackService.findById(id);
    } catch (Exception e) {
      return null;
    }
  }

  @PutMapping()
  public String update(@RequestBody Feedback feedback) {
    try {
      return feedbackService.update(feedback);

    } catch (Exception e) {
      return null;
    }
  }
}
