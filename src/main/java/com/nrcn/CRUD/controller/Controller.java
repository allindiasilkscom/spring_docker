package com.nrcn.CRUD.controller;

import com.nrcn.CRUD.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private studentService service;

    @GetMapping("/home")
    public String Home(){
        return  "welcoem to docker";
    }
    @GetMapping("/students")
    public String getAllStudent(Model model){
        model.addAttribute("students",service.getAllStudent());
        return "students";
    }
}
