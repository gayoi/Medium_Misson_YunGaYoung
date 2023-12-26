package com.ll.medium.domain.home.home.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository <SiteMember,Long> {
    Optional<SiteMember> findByusername(String username);
}

