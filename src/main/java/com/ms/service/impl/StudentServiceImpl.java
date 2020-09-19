package com.ms.service.impl;

import com.ms.dto.*;
import com.ms.handler.StudentNotFoundException;
import com.ms.model.Address;
import com.ms.model.Project;
import com.ms.model.Student;
import com.ms.repository.StudentRepository;
import com.ms.search.SearchSpecification;
import com.ms.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    @Override
    @Transactional
    public List<StudentDTO>  getStudents() {
        return studentRepository.findAll().stream().map(student -> {
            StudentDTO studentDTO = modelMapper.map(student,StudentDTO.class);
            if(student.getAddress() != null)
                studentDTO.setAddress(modelMapper.map(student.getAddress(), AddressDTO.class));
            if (student.getProject() != null)
                studentDTO.setProject(modelMapper.map(student.getProject(), ProjectDTO.class));
            if (!student.getGroups().isEmpty() && student.getGroups() !=null)
                studentDTO.setGroups(student.getGroups().stream().map(group -> {
                    return modelMapper.map(group,GroupDTO.class);
                }).collect(Collectors.toSet()));
            return studentDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public Student saveStudent(StudentDTO dto) {
        Address address = new Address();
        address.setCity(dto.getAddress().getCity());
        address.setStreet(dto.getAddress().getStreet());
        Project project = new Project();
        project.setDescription(dto.getProject().getDescription());
        project.setName(dto.getProject().getName());
        Student newStudent = new Student();
        newStudent.setName(dto.getName());
        newStudent.setEmail(dto.getEmail());
        newStudent.setAddress(address);
        newStudent.setProject(project);
        return studentRepository.save(newStudent);
    }


    @Transactional
    @Override
    public Page<StudentDTO> search(GenericSearchDto search, Pageable pageable) {
        return studentRepository.findAll(new SearchSpecification<>(search.getCriteria()), pageable)
                .map(p -> modelMapper.map(p, StudentDTO.class));

    }

    @Override
    public List<Student> findStudentBySpecification() {
        studentRepository.findAll((root, query, cb) -> cb.equal(root.get("firstName"), "Tofik"))
                .forEach(s -> System.out.println("Student:" + s));
        return null;
    }

    @Override
    public Student saveStudentEntity(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }


}
