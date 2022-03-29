package com.stoyakin_artem.springboot.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PetType extends BaseClass{

    @Column(name = "name")
    private String name;


}
