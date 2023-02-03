package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Member;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.MessageResponse;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private AuthService authService;

	@PostMapping("/create-member")
	public Member createMember(@RequestBody Member member) {
		try {
			return authService.createMember(member);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}