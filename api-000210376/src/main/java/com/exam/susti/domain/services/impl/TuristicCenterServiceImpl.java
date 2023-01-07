package com.exam.susti.domain.services.impl;

import com.exam.susti.domain.entities.TuristicCenter;
import com.exam.susti.domain.services.ITuristicCenterService;
import com.exam.susti.infraestrucutre.repositories.TuristicCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuristicCenterServiceImpl implements ITuristicCenterService {

    @Autowired
    private TuristicCenterRepository repo;

    @Override
    public TuristicCenter save(TuristicCenter turisticCenter) {
        return repo.save(turisticCenter);
    }

    @Override
    public TuristicCenter update(TuristicCenter turisticCenter) {
        return repo.save(turisticCenter);
    }

    @Override
    public void delete(Integer id) {
        TuristicCenter turisticCenter = findById(id);
        if (turisticCenter != null) {
            repo.delete(turisticCenter);
        }
    }

    @Override
    public TuristicCenter findById(Integer id) {
        return repo.findById(id).orElseGet(TuristicCenter::new);
    }

    @Override
    public List<TuristicCenter> findAll() {
        return repo.findAll();
    }

    @Override
    public List<TuristicCenter> findByTypeTuristicCenterId(Integer id) {
        return repo.findByTypeTuristicCenterId(id);
    }

    @Override
    public List<TuristicCenter> findByFee(Double fee) {
        return repo.findByFee(fee);
    }
}
