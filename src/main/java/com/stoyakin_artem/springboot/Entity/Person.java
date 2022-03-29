package com.stoyakin_artem.springboot.Entity;


import lombok.*;

import javax.persistence.MappedSuperclass;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Person extends BaseClass{

    private String name;
    private String surname;

    public Person(Long id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }
}
