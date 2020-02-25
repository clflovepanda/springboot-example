package com.panda.springbootexample.controller;

import com.alibaba.fastjson.JSON;
import com.panda.springbootexample.domain.Student;
import com.panda.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ASUS
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/getStudent")
    public void getStudent(@RequestParam("id") int id,
                           HttpServletRequest request,
                           HttpServletResponse response) throws IOException {

        Student student = studentService.getStudent(id);
        response.getWriter().write(JSON.toJSONString(student));

    }
}
