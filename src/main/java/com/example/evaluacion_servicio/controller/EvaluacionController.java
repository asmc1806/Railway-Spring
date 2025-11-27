package com.example.evaluacion_servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.evaluacion_servicio.model.Evaluacion;
import com.example.evaluacion_servicio.repository.EvaluacionRepository;

import java.util.List;

@RestController
@RequestMapping("/evaluaciones")
@CrossOrigin(origins = "*") // (opcional) Permite consumir desde HTML en Railway
public class EvaluacionController {

    @Autowired
    private EvaluacionRepository repository;

    // Registrar evaluación (JSON)
    @PostMapping("/registrar")
    public Evaluacion registrar(@RequestBody Evaluacion eval) {
        return repository.save(eval);
    }

    // Listar todas las evaluaciones
    @GetMapping("/listar")
    public List<Evaluacion> listar() {
        return repository.findAll();
    }
}
