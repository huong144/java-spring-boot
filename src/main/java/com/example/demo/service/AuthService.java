package com.example.demo.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.example.demo.models.Member;
import com.example.demo.repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;

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

  // @Override
  public UserDetails loadUserByUsername() {
    // Member userAccount =
    // memberRepository.findUserAccountByUsernameOrEmailOrPhoneNumberOrId(s,s,s,s);
    // List<SimpleGrantedAuthority> grantedAuthorityList = new
    // Member().getEmail().stream()
    // .map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toList());
    // if(userAccount != null){
    return org.springframework.security.core.userdetails.User
        .withUsername("admin")
        .password("password")
        // .authorities(grantedAuthorityList)
        .build();
    // }else throw new NullPointerException("NOT FOUND : " + s);
  }
}