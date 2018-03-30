package com.example.cristinavilas.getup.CrearAlarma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.cristinavilas.getup.R;

public class Paso_3 extends AppCompatActivity {

    private ListView listView;
    private Button buttonAniadir;
    private Button buttonTerminar;

    private String[] actividades = {"Desayuno","Ducharse","Vestirse"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_crear__alarma_3);

        listView = findViewById(R.id.listView);
        buttonAniadir = findViewById(R.id.btnAniadir);
        buttonTerminar = findViewById(R.id.btnTerminar);


    }

    public void aniadir(View view){

        Intent i = new Intent(this,AniadirActividades.class);
        startActivity(i);

    }

    public void terminar(View view){

    }
}