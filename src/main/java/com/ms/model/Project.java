package com.ms.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = Project.TABLE_NAME)

public class Project implements Serializable {
    private static final long serialVersionUID = 6447416794596398975L;
    public static final String TABLE_NAME = "projects";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String name;

    private String description;


    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();


    @Override
    public String toString() {
        return "Project{" +
                "id=" + projectId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
