package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.Member;
import com.example.demo.repository.MemberRepository;
@Service
public class AuthService {
  private static final String SUCCESS = null;
  @Autowired
  private MemberRepository memberRepository;

  // public Member createMember(Member member) throws BadHttpRequest {
  //   Optional<Member> checkPhoneNumber = memberRepository.findByTelephone(member.getTelephone());
  //   if (!checkPhoneNumber.isPresent()) {
  //     return memberRepository.save(member);
  //   } else {
  //     throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
  //   }
  // }

  public String addMember(Member member) {
    try {
      memberRepository.save(member);
      return SUCCESS;
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
  }

  public Member findMemberByTelephone(String s){
    return memberRepository.findByTelephone(s);
  }
}