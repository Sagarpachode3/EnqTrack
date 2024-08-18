package com.psagar3codes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psagar3codes.entity.UserDetailsEnity;

public interface UserDetailsRepo extends JpaRepository<UserDetailsEnity, Integer> {

}
