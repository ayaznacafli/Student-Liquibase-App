package com.ms.service;

import com.ms.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student saveStudent(Student student);
}
