package com.exam.susti.domain.services;

import com.exam.susti.domain.entities.TypeTuristicCenter;

import java.util.List;

public interface ITypeTuristicCenterService {

    TypeTuristicCenter save(TypeTuristicCenter typeTuristicCenter);

    TypeTuristicCenter update(TypeTuristicCenter typeTuristicCenter);

    TypeTuristicCenter findById(Integer id);

    void delete(Integer id);

    List<TypeTuristicCenter> findAll();
}
