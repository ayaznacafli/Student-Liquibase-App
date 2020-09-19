package com.ms.service;

import com.ms.dto.GenericSearchDto;
import com.ms.dto.StudentDTO;
import com.ms.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    List<StudentDTO>  getStudents();
    Student saveStudent(StudentDTO student);
    Student getStudentById(Long id);
    Student saveStudentEntity(Student student);
    Page<StudentDTO> search(GenericSearchDto search, Pageable pageable);
    List<Student> findStudentBySpecification();
}
