package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Member;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.ResponseMessage;
import com.example.demo.service.AuthService;
import com.example.demo.utils.ConvertSHA1;

@RestController
@RequestMapping("/auth")
public class AuthController {
  @Autowired
  private AuthService authService;

  @PostMapping("/register")
  public BaseResponse register(@RequestBody Member member) {
    member.setPassword(ConvertSHA1.convertSHA1(member.getPassword()));
    String resMess = authService.addMember(member);
    if (resMess.equalsIgnoreCase("success")) {
    return new ResponseMessage(HttpStatus.OK.value(), resMess);
    } else {
    return new ResponseMessage(HttpStatus.BAD_REQUEST.value(), "false");
    }
  }
}