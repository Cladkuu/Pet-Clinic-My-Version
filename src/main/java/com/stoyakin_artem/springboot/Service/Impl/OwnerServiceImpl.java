package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Owner;
import com.stoyakin_artem.springboot.Service.OwnerService;
import com.stoyakin_artem.springboot.repositories.OwnerRepository;
import com.stoyakin_artem.springboot.repositories.PetRepository;

import java.util.List;


public class OwnerServiceImpl implements OwnerService {


    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository, PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
    }

    @Override
    public List<Owner> findAll() {
        return null;
    }

    @Override
    public Owner getById(Long id) {
        return null;
    }

    @Override
    public void save(Owner object) {
        if(object!=null){

        }
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public Owner update(Owner object) {
        return null;
    }


    @Override
    public Owner findOwnerByName(String name) {
        return null;
    }

    @Override
    public List<Owner> findAllBySurname(String surname) {
        return null;
    }


}
