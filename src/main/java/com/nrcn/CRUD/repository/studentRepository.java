package com.nrcn.CRUD.repository;

import com.nrcn.CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface studentRepository extends JpaRepository<Student,Integer> {
}
