package com.stoyakin_artem.springboot.Service.Impl;


import com.stoyakin_artem.springboot.Entity.Visit;
import com.stoyakin_artem.springboot.Service.VisitService;
import com.stoyakin_artem.springboot.repositories.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class VisitServiceImpl implements VisitService {
    private final VisitRepository visitRepository;

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit getById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Visit object) {
        visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public Visit update(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
