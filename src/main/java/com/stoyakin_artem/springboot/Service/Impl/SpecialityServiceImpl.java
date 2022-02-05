package com.stoyakin_artem.springboot.Service.Impl;

import com.stoyakin_artem.springboot.Entity.Pet;
import com.stoyakin_artem.springboot.Entity.Speciality;
import com.stoyakin_artem.springboot.Service.SpecialityService;
import com.stoyakin_artem.springboot.repositories.SpecialityRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality getById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Speciality object) {
        specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public Speciality update(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
