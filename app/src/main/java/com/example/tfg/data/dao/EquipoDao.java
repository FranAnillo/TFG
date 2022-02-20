package com.example.tfg.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tfg.data.model.Equipo;

@Dao
public interface EquipoDao {
    @Insert
    void indert(Equipo equipo);

    @Update
    void update (Equipo equipo);

    @Delete
    void delete(Equipo equipo);

//    @Query("SELECT tarea  FROM tarea_table where tarea.equipo==equipo")
//    void selectAllTasksFromTeam();

}
