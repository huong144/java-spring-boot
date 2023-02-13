package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Member;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer> {

   Member findByTelephone(String telephone);

   Member findByEmail(String email);
}
