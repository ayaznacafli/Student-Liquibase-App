package com.ms.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor()
@ToString(exclude = "student")
@Getter
@Setter
@Table(name = Address.TABLE_NAME)
public class Address implements Serializable {
    private static final long serialVersionUID = 6447416794596398975L;

    static final String TABLE_NAME = "address";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String city;
    private String street;

    @OneToOne(mappedBy = "address")
    private Student student;

}
