package com.psagar3codes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psagar3codes.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
