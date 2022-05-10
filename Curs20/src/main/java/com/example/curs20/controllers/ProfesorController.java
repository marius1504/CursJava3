package com.example.curs20.controllers;

import com.example.curs20.associaton.Materie;
import com.example.curs20.associaton.Profesor;
import com.example.curs20.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/profesor")
public class ProfesorController {


    private final ProfesorRepository profesorRepository;
    @Autowired
    public ProfesorController(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<Profesor> getProfesorById(@PathVariable Integer id) {
       return Optional.of(profesorRepository.findById(id).orElseThrow());
    }

    @GetMapping(path = "/{id}/materii")
    public @ResponseBody List<Optional<Materie>> getMateriiByProfesorId(@PathVariable Integer id) {
        return profesorRepository.findMateriiByProfesorId(id);
    }
}
