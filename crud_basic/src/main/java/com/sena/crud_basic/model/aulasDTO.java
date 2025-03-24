package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "aulas")
public class aulasDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_aulas;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "capacidad", nullable = false)
    private int capacidad;

    // Relación OneToMany con Cursos (según tu estilo)
    @OneToMany(mappedBy = "id_aula")
    private List<cursosDTO> cursos;

    // Constructores
    public aulasDTO() {}

    public aulasDTO(int id_aulas, String numero, int capacidad) {
        this.id_aulas = id_aulas;
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public int getId_aulas() {
        return id_aulas;
    }

    public void setId_aulas(int id_aulas) {
        this.id_aulas = id_aulas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<cursosDTO> getCursos() {
        return cursos;
    }

    public void setCursos(List<cursosDTO> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "aulasDTO{" +
                "id_aulas=" + id_aulas +
                ", numero='" + numero + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}