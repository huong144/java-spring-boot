package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.models.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class AuthService {
  private static final String SUCCESS = "success";
  private static final String FALSE = "false";
  @Autowired
  private MemberRepository memberRepository;

  public String addMember(Member member) {
    try {

      Member checkTelephone = findMemberByTelephone(member.getTelephone());
      Member checkEmail = findMemberByEmail(member.getEmail());
      if (checkEmail == null && checkTelephone == null) {
        memberRepository.save(member);
        return SUCCESS;
      } else {
        return FALSE;
      }
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
  }

  public Member findMemberByTelephone(String s) {
    return memberRepository.findByTelephone(s);
  }

  public Member findMemberByEmail(String s) {
    return memberRepository.findByEmail(s);
  }
}