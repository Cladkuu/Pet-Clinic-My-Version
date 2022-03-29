package com.stoyakin_artem.springboot.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Owner extends Person{


    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Pet> pets = new HashSet<>();

    public void AddPet(Pet pet){
        this.pets.add(pet);
    }

    @Builder
    public Owner(Long id, String name, String surname, String address, String city, String telephone, Set<Pet> pets) {
        super(id, name, surname);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
}
