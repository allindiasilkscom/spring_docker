package com.nrcn.CRUD.serviceImpl;

import com.nrcn.CRUD.entity.Student;
import com.nrcn.CRUD.repository.studentRepository;
import com.nrcn.CRUD.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviceImpl implements studentService {
    @Autowired
     studentRepository studdentRepository;

    @Override
    public List<Student> getAllStudent() {

        List<Student>list = studdentRepository.findAll();

        return list;

    }
}
