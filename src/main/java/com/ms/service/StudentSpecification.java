package com.ms.service;

import com.ms.model.Student;
import org.springframework.data.jpa.domain.Specification;

public class StudentSpecification {

    public static Specification<Student> studentWithName(String name) {
        return  (root, query, cb) -> cb.equal(root.get("firstName"), name);
    }

}
