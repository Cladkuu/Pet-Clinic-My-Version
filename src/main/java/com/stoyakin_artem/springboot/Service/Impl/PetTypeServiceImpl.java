package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Pet;
import com.stoyakin_artem.springboot.Entity.PetType;
import com.stoyakin_artem.springboot.Service.PetService;
import com.stoyakin_artem.springboot.Service.PetTypeService;
import com.stoyakin_artem.springboot.repositories.PetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PetTypeServiceImpl implements PetTypeService {

    private  final PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType getById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(PetType object) {
        petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public PetType update(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
