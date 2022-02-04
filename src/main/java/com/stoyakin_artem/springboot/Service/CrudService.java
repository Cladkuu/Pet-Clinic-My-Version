package com.stoyakin_artem.springboot.Service;

import java.util.List;

public interface CrudService<Object> {

    List<Object> findAll();

    Object getById(Long id);

    void save(Object object);

    void delete(Object object);

    Object update(Object object);

}
