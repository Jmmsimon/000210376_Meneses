package com.exam.susti.domain.services;

import com.exam.susti.domain.entities.TuristicCenter;

import java.util.List;

public interface ITuristicCenterService {

    TuristicCenter save(TuristicCenter turisticCenter);

    TuristicCenter update(TuristicCenter turisticCenter);

    void delete(Integer id);

    TuristicCenter findById(Integer id);

    List<TuristicCenter> findAll();

    List<TuristicCenter> findByTypeTuristicCenterId(Integer id);

    List<TuristicCenter> findByFee(Double fee);
}
