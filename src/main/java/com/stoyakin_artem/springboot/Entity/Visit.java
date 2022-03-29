package com.stoyakin_artem.springboot.Entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Objects;


@Data
@EqualsAndHashCode(exclude = {"pet", "vet"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Visit extends BaseClass{

    private LocalDate date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "vet_id")
    private Vet vet;


    public Visit(LocalDate date, String description, Pet pet) {
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    public void AddPet(Pet pet){
        setPet(pet);
        pet.addVisit(this);
    }

    public void AddVet(Vet vet){
        setVet(vet);
        vet.AddVisit(this);
    }

    }
