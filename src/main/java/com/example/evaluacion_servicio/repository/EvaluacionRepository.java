package com.example.evaluacion_servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.evaluacion_servicio.model.Evaluacion;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}
