package com.stoyakin_artem.springboot.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vet extends Person {

    public Vet() {
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
    joinColumns = @JoinColumn(name = "vet_id"),
    inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    @OneToMany(mappedBy = "vet", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Visit> visits = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
