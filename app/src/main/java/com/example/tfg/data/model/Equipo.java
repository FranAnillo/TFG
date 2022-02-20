package com.example.tfg.data.model;
import androidx.room.*;

@Entity(tableName = "equipo_table")
public class Equipo {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String nombre;

    @Embedded
    private LoggedInUser user;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUser(LoggedInUser user) {
        this.user = user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

}
