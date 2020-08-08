package com.ms.service.impl;

import com.ms.model.Student;
import com.ms.repository.StudentRepository;
import com.ms.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Override
    public List<Student> getStudents() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }
}
