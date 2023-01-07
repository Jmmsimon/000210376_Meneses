package com.exam.susti.infraestrucutre.repositories;

import com.exam.susti.domain.entities.TuristicCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TuristicCenterRepository extends JpaRepository<TuristicCenter, Integer> {

    List<TuristicCenter> findByTypeTuristicCenterId(Integer id);

    List<TuristicCenter> findByFee(Double fee);
}
