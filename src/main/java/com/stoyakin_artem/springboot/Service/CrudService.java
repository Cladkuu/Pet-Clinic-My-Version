package com.stoyakin_artem.springboot.Service;

import java.util.Set;

public interface CrudService<Object> {

    Set<Object> findAll();

    Object getById(Long id);

    void save(Object object);

    void delete(Object object);

    Object update(Object object);

    void deleteById(Long id);

}
