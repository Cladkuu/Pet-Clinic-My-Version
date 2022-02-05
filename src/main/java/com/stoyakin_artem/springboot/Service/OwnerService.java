package com.stoyakin_artem.springboot.Service;


import com.stoyakin_artem.springboot.Entity.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner> {

    Owner findOwnerBySurname(String name);

    List<Owner> findAllBySurnameLike(String surname);
}
