package com.example.tfg.data.database;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.tfg.data.dao.TareaDao;
import com.example.tfg.data.model.LoggedInUser;
import com.example.tfg.data.model.Tarea;

import java.time.LocalDate;

@Database(entities = {Tarea.class}, version=1)
public abstract class TareaDatabase extends RoomDatabase {

    private static TareaDatabase instance;

    public abstract TareaDao tareaDao();

    public static synchronized TareaDatabase getInstance(Context context){
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    TareaDatabase.class,"tarea_database").fallbackToDestructiveMigration()
                    .addCallback(roomCallback).build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback= new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };
    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{

        private TareaDao tareaDao;

        private PopulateDbAsyncTask (TareaDatabase database){
            tareaDao=database.tareaDao();
            new PopulateDbAsyncTask(instance).execute();
        }
        @RequiresApi(api = Build.VERSION_CODES.O)
        protected Void doInBackground(Void... voids){
            LoggedInUser user= new LoggedInUser("20000", "WillyRex");
            LocalDate fecha = LocalDate.of(2022, 1, 25 );
            LocalDate fechafin= LocalDate.of(2022, 10, 22);
            tareaDao.indert(new Tarea("Prueba","Descripcion de prueba", fecha, fechafin, 15, 1, user));
            return null;
        }

    }
}
