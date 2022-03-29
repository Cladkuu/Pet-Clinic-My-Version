package com.stoyakin_artem.springboot.Entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"owner"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pet extends BaseClass{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private Set<Visit> visits = new HashSet<>();

    public void addVisit(Visit visit){
        this.visits.add(visit);
    }


    public void setOwner0(Owner owner) {
        this.owner = owner;
        owner.AddPet(this);
    }
}
