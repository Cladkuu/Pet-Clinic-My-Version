package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
