package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.Member;
import com.example.demo.repository.MemberRepository;

import javassist.tools.web.BadHttpRequest;

@Service
public class AuthService {
	@Autowired
	private MemberRepository memberRepository;

	public Member createMember(Member member) throws BadHttpRequest {
		Optional<Member> checkPhoneNumber = memberRepository.findByTelephone(member.getTelephone());
		if (!checkPhoneNumber.isPresent()) {
			return memberRepository.save(member);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
	}
}