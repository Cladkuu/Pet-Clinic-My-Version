package com.stoyakin_artem.springboot.repositories;

import com.stoyakin_artem.springboot.Entity.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
