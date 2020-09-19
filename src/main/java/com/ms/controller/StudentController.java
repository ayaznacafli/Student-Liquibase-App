package com.ms.controller;

import com.ms.dto.GenericSearchDto;
import com.ms.dto.StudentDTO;
import com.ms.model.Student;
import com.ms.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
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
    public List<StudentDTO>  getStudents() {
        return service.getStudents();
    }

    @PostMapping
    public Student save(@RequestBody StudentDTO student) {
        return service.saveStudent(student);
    }

    @PostMapping("/search")
    public Page<StudentDTO> searchStudents(@RequestBody GenericSearchDto search, Pageable pageable) {
        return service.search(search, pageable);
    }

}
