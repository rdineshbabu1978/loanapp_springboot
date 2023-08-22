package com.stackroute.student.repository;

// create interface StudentRepo which extends JpaRepository

import com.stackroute.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
