package com.spring.Jpa_many.to.many.Repository;

import com.spring.Jpa_many.to.many.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByFeeLessThan(double fee);
}
