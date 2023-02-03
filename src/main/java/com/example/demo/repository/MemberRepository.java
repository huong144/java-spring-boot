package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Member;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {

  Optional<Member> findByTelephone(String telephone);}
