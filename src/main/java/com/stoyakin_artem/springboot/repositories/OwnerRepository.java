package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findBySurname(String name);

    List<Owner> findAllBySurnameLike(String surname);
}
