package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
