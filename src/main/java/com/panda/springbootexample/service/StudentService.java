package com.panda.springbootexample.service;

import com.panda.springbootexample.dao.StudentDao;
import com.panda.springbootexample.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getStudent(int id) {
        return studentDao.getStudentById(id);
    }

}
