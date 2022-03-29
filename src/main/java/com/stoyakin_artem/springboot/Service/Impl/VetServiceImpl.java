package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Pet;
import com.stoyakin_artem.springboot.Entity.Vet;
import com.stoyakin_artem.springboot.Service.VetService;
import com.stoyakin_artem.springboot.repositories.VetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class VetServiceImpl implements VetService {

    private final VetRepository vetRepository;


    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet getById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Vet object) {
        vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public Vet update(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }


}
