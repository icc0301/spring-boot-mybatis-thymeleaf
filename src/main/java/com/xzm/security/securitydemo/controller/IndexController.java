package com.xzm.security.securitydemo.controller;

import com.xzm.security.securitydemo.entity.StudentEntity;
import com.xzm.security.securitydemo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {

    private final StudentService studentService;

    public IndexController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public void index(){

        System.out.println("Hello World");
        StudentEntity res = studentService.queryById(1);
        System.out.println(res.getId());
        System.out.println(res.getName());
        System.out.println(res.getAge());

    }
}
