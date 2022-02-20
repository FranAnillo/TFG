package com.example.tfg.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.tfg.data.model.Tarea;
@Dao
public interface TareaDao {
    @Insert
    void indert(Tarea tarea);

    @Update
    void update (Tarea tarea);

    @Delete
    void delete(Tarea tarea);
    
    @Query("SELECT * FROM tarea_table")
    void getAllTareas();


}
