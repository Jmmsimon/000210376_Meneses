package com.exam.susti.application.controllers;


import com.exam.susti.domain.entities.TuristicCenter;
import com.exam.susti.domain.entities.TypeTuristicCenter;
import com.exam.susti.domain.services.ITypeTuristicCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeTuristicCenterController {

    @Autowired
    private ITypeTuristicCenterService service;

    @PostMapping("/save")
    public ResponseEntity<TypeTuristicCenter> save(@Valid @RequestBody TypeTuristicCenter typeTuristicCenter) {
        TypeTuristicCenter TypeTuristicCenterNew = service.save(typeTuristicCenter);
        return new ResponseEntity<>(TypeTuristicCenterNew, HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<TypeTuristicCenter>> findAll() {
        List<TypeTuristicCenter> typeTuristicCenterFound = service.findAll();
        return new ResponseEntity<>(typeTuristicCenterFound, HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<TypeTuristicCenter> findById(@PathVariable("id") Integer id) {
        TypeTuristicCenter typeTuristicCenterFound = service.findById(id);
        return new ResponseEntity<>(typeTuristicCenterFound, HttpStatus.OK);
    }
}
