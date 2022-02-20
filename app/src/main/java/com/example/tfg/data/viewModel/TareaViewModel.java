package com.example.tfg.data.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.tfg.data.model.Tarea;
import com.example.tfg.data.repository.TareaRepository;

import java.util.List;

public class TareaViewModel extends AndroidViewModel {

    private TareaRepository repository;
    private LiveData<List<Tarea>> tareas;

    public TareaViewModel(@NonNull Application application) {
        super(application);
        repository = new TareaRepository(application);
    }

    public void insert(Tarea tarea){
        repository.insert(tarea);
    }
    public void update(Tarea tarea){
        repository.update(tarea);
    }
    public void delete(Tarea tarea){
        repository.delete(tarea);
    }
}
