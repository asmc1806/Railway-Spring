package com.example.evaluacion_servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.evaluacion_servicio.model.Evaluacion;
import com.example.evaluacion_servicio.repository.EvaluacionRepository;

@Controller
@RequestMapping("/evaluaciones")
public class EvaluacionController {

    @Autowired
    private EvaluacionRepository repository;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("evaluacion", new Evaluacion());
        return "formulario"; 
    }

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Evaluacion eval) {
        repository.save(eval);
        return "redirect:/evaluaciones/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "listar"; 
    }
}
