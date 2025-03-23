package com.sena.crud_basic.model;



import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "inscripciones")
public class inscripcionesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_inscripciones;

    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private estudianteDTO id_estudiante;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private cursosDTO id_cursos;

    @Column(name = "fecha_Inscripcione", nullable = false)
   private LocalDate fechaInscripcione;

   //getter y setter  
    public int getid_inscripciones(){
        return id_inscripciones;
    }
 
    public void setid_inscripciones(int id_inscripciones){
        this.id_inscripciones = id_inscripciones;
    }

    public estudianteDTO getid_estudiante(){
        return id_estudiante;
    }

    public void setid_estudiante(estudianteDTO id_estudiante){
        this.id_estudiante = id_estudiante;
    }

    public cursosDTO getid_cursos(){
        return id_cursos;
    }

    public void setid_cursos(cursosDTO id_cursos){
        this.id_cursos = id_cursos;
    }

    public LocalDate getfechaInscripcione(){
        return fechaInscripcione;
    }

    public void setfechaInscripcione(LocalDate fechaInscripcione){
        this.fechaInscripcione = fechaInscripcione;
    }
}