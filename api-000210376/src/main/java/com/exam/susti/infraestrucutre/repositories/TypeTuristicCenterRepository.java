package com.exam.susti.infraestrucutre.repositories;

import com.exam.susti.domain.entities.TypeTuristicCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTuristicCenterRepository extends JpaRepository<TypeTuristicCenter, Integer> {
}
