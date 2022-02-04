package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
