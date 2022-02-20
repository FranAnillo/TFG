package com.example.tfg.data.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.tfg.data.dao.TareaDao;
import com.example.tfg.data.database.TareaDatabase;
import com.example.tfg.data.model.Tarea;

import java.util.List;

public class TareaRepository {
    private TareaDao tareaDao;
    private LiveData<List<Tarea>> allTarea;

    public TareaRepository(Application application){
        TareaDatabase database= TareaDatabase.getInstance(application);
        tareaDao =database.tareaDao();
    }
        public void insert(Tarea tarea){
            new InsertTareaAsyncTask(tareaDao).execute(tarea);
        }

        public void delete(Tarea tarea){
            new DeleteTareaAsyncTask(tareaDao).execute(tarea);
        }
        public void update(Tarea tarea){
            new UpdateTareaAsyncTask(tareaDao).execute(tarea);
        }

        private static class InsertTareaAsyncTask extends AsyncTask<Tarea,Void, Void>{
        private TareaDao tareaDao;

        private InsertTareaAsyncTask(TareaDao tareaDao){
            this.tareaDao=tareaDao;
        }

        protected Void doInBackground(Tarea... tareas){
            tareaDao.indert(tareas[0]);
            return null;
        }

        }

    private static class UpdateTareaAsyncTask extends AsyncTask<Tarea,Void, Void>{
        private TareaDao tareaDao;

        private UpdateTareaAsyncTask(TareaDao tareaDao){
            this.tareaDao=tareaDao;
        }

        protected Void doInBackground(Tarea... tareas){
            tareaDao.update(tareas[0]);
            return null;
        }

    }
    private static class DeleteTareaAsyncTask extends AsyncTask<Tarea,Void, Void>{
        private TareaDao tareaDao;

        private DeleteTareaAsyncTask(TareaDao tareaDao){
            this.tareaDao=tareaDao;
        }

        protected Void doInBackground(Tarea... tareas){
            tareaDao.delete(tareas[0]);
            return null;
        }

    }
}
