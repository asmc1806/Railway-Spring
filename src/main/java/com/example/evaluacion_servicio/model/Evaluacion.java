package com.example.evaluacion_servicio.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(nullable = false)
    private LocalDateTime fechaEntrega;

    @Column(nullable = false)
    private String tipoEncomienda;

    @Column(nullable = false)
    private int calificacion;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    // Constructor vacío (necesario para JPA)
    public Evaluacion() {
    }

    // Constructor con todos los campos (opcional)
    public Evaluacion(String nombre, LocalDateTime fechaRegistro, LocalDateTime fechaEntrega,
                      String tipoEncomienda, int calificacion, String descripcion) {
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.fechaEntrega = fechaEntrega;
        this.tipoEncomienda = tipoEncomienda;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getTipoEncomienda() {
        return tipoEncomienda;
    }

    public void setTipoEncomienda(String tipoEncomienda) {
        this.tipoEncomienda = tipoEncomienda;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // toString
    @Override
    public String toString() {
        return "Evaluacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaEntrega=" + fechaEntrega +
                ", tipoEncomienda='" + tipoEncomienda + '\'' +
                ", calificacion=" + calificacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
