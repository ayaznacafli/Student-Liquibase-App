package com.ms.controller;

import com.ms.model.Student;
import com.ms.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/app")
public class StudentController {

    private final StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.saveStudent(student);
    }
}
