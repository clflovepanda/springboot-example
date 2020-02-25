package com.panda.springbootexample.dao;

import com.panda.springbootexample.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ASUS
 */
@Repository
public interface StudentDao {

    Student getStudentById(@Param("id") int id);
}
