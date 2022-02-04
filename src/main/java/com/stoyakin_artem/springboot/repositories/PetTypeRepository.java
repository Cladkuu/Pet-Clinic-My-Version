package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
