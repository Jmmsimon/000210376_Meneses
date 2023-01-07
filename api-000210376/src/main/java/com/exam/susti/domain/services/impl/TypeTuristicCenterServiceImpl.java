package com.exam.susti.domain.services.impl;

import com.exam.susti.domain.entities.TypeTuristicCenter;
import com.exam.susti.domain.services.ITypeTuristicCenterService;
import com.exam.susti.infraestrucutre.repositories.TypeTuristicCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeTuristicCenterServiceImpl implements ITypeTuristicCenterService {

    @Autowired
    private TypeTuristicCenterRepository typeTuristicCenterRepository;

    @Override
    public TypeTuristicCenter save(TypeTuristicCenter typeTuristicCenter) {
        return typeTuristicCenterRepository.save(typeTuristicCenter);
    }

    @Override
    public TypeTuristicCenter update(TypeTuristicCenter typeTuristicCenter) {
        return typeTuristicCenterRepository.save(typeTuristicCenter);
    }

    @Override
    public TypeTuristicCenter findById(Integer id) {
        return typeTuristicCenterRepository.findById(id).orElseGet(TypeTuristicCenter::new);
    }

    @Override
    public void delete(Integer id) {
        TypeTuristicCenter typeTuristicCenterFound = findById(id);
        if(typeTuristicCenterFound != null){
            typeTuristicCenterRepository.delete(typeTuristicCenterFound);
        }else{
            throw new RuntimeException("Type Turistic Center not found");
        }

    }

    @Override
    public List<TypeTuristicCenter> findAll() {
        return typeTuristicCenterRepository.findAll();
    }
}
