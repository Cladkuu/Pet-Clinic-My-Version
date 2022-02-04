package com.stoyakin_artem.springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PetType extends BaseClass{

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
