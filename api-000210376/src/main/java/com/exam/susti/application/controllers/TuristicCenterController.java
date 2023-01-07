package com.exam.susti.application.controllers;

import com.exam.susti.domain.entities.TuristicCenter;
import com.exam.susti.domain.services.ITuristicCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turistic-centers")
public class TuristicCenterController {

    @Autowired
    private ITuristicCenterService service;

    @PostMapping("/save")
    public ResponseEntity<TuristicCenter> save(@Valid @RequestBody TuristicCenter turisticCenter) {
        TuristicCenter turisticCenterNew = service.save(turisticCenter);
        return new ResponseEntity<>(turisticCenterNew, HttpStatus.CREATED);
    }


    @GetMapping("/findAll")
    public ResponseEntity<List<TuristicCenter>> findAll() {
        List<TuristicCenter> turisticCenterFound = service.findAll();
        return new ResponseEntity<>(turisticCenterFound, HttpStatus.OK);
    }
}
