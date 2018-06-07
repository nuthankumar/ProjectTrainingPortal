package com.betsol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betsol.model.Course;
import com.betsol.model.Training;
import com.betsol.model.User;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Long> {
	
}
