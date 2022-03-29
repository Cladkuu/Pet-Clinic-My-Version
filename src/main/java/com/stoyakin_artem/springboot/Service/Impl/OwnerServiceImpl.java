package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Owner;
import com.stoyakin_artem.springboot.Service.OwnerService;
import com.stoyakin_artem.springboot.repositories.OwnerRepository;
import com.stoyakin_artem.springboot.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class OwnerServiceImpl implements OwnerService {


    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;


    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner getById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Owner object) {
        ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public Owner update(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }


    @Override
    public Owner findOwnerBySurname(String name) {
        return ownerRepository.findBySurname(name);
    }

    @Override
    public List<Owner> findAllBySurnameLike(String surname) {
        return ownerRepository.findAllBySurnameLike(surname);
    }


}
