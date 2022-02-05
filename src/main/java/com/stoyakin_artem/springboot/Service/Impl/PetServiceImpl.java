package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Pet;
import com.stoyakin_artem.springboot.Service.PetService;
import com.stoyakin_artem.springboot.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PetServiceImpl implements PetService {
    private final PetRepository petRepository;


    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet getById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Pet object) {
        petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public Pet update(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }

}
