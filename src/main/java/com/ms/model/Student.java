package com.ms.model;


import javax.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = Student.TABLE_NAME)
public class Student implements Serializable {
    private static final long serialVersionUID = 6447416794596398975L;

    public static final String TABLE_NAME = "students";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Project project;



    @ManyToMany(mappedBy = "students",fetch = FetchType.LAZY)
    /*@JoinTable(name = "group_student",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="group_id"))*/
    private Set<Group> groups = new HashSet<>();



}
