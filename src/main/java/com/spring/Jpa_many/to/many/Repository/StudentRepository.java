package com.spring.Jpa_many.to.many.Repository;

import com.spring.Jpa_many.to.many.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
}
