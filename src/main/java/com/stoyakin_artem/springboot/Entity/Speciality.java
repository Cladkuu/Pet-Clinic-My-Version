package com.stoyakin_artem.springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Speciality extends BaseClass{

    @Column(name = "description")
    private String description;

    public Speciality(String description) {
        this.description = description;
    }

    public Speciality() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
