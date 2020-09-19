package com.ms.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Group.TABLE_NAME)
public class Group implements Serializable {
    private static final long serialVersionUID = 6447416794596398975L;

    public static final String TABLE_NAME = "grups";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    private String name;
    private String description;

    @ManyToMany(cascade =CascadeType.ALL)
    @JoinTable(name = "group_student",
            joinColumns = @JoinColumn(name="group_id"),
            inverseJoinColumns = @JoinColumn(name="student_id"))
    private Set<Student> students= new HashSet<>();






}

