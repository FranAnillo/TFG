package com.example.tfg.data;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.tfg.data.viewModel.TareaViewModel;

public class MainActivity extends AppCompatActivity {
    private TareaViewModel tareaViewModel;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    tareaViewModel = ViewModelProviders.of(this).get(TareaViewModel.class);

    }
}
