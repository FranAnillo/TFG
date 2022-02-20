package com.example.tfg.data.model;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import javax.*;

import java.time.LocalDate;

@Entity(tableName = "tarea_table")

public class Tarea {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaDeIncio;
    private LocalDate fechaDeFin;
    private Integer duracion;
    private Integer priorizacion;
    @Embedded
    private LoggedInUser user;

    public Tarea(String nombre, String descripcion, LocalDate fechaDeIncio, LocalDate fechaDeFin, Integer duracion,Integer priorizacion, LoggedInUser user) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDeIncio = fechaDeIncio;
        this.fechaDeFin = fechaDeFin;
        this.duracion = duracion;
        this.priorizacion=priorizacion;
        this.user = user;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaDeIncio(LocalDate fechaDeIncio) {
        this.fechaDeIncio = fechaDeIncio;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getPriorizacion() {
        return priorizacion;
    }

    public void setPriorizacion(Integer priorizacion) {
        this.priorizacion = priorizacion;
    }

    public LoggedInUser getUser() {
        return user;
    }

    public void setUser(LoggedInUser user) {
        this.user = user;
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
    }
}
