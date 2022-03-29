package com.stoyakin_artem.springboot.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Vet extends Person {


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
    joinColumns = @JoinColumn(name = "vet_id"),
    inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    @OneToMany(mappedBy = "vet", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Visit> visits = new HashSet<>();

    public void AddSpecialty(Speciality speciality){
        this.specialities.add(speciality);
    }

    public void AddVisit(Visit visit){
        this.visits.add(visit);
    }
}
