package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "cursos")
public class cursosDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_cursos;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;

    @Column(name = "descripción", columnDefinition = "TEXT")
    private String descripción;

    // Relación ManyToOne con Aulas (según tu estilo)
    @ManyToOne
    @JoinColumn(name = "id_aula")
    private aulasDTO id_aula;

    // Getters y Setters
    public int getId_cursos() {
        return id_cursos;
    }

    public void setId_cursos(int id_cursos) {
        this.id_cursos = id_cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public aulasDTO getId_aula() {
        return id_aula;
    }

    public void setId_aula(aulasDTO id_aula) {
        this.id_aula = id_aula;
    }
}