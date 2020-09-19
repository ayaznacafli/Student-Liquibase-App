package com.ms.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class StudentDTO {

    private String name;
    private String email;

    private AddressDTO address;
    private ProjectDTO project;
    private Set<GroupDTO> groups;


}
