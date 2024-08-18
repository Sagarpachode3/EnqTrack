package com.psagar3codes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psagar3codes.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
