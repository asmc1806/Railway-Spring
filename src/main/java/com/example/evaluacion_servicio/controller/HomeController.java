package com.example.evaluacion_servicio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }
}
