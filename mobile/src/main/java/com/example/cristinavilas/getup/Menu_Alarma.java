package com.example.cristinavilas.getup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.cristinavilas.getup.CrearAlarma.CrearAlarma;

import java.util.ArrayList;

import static com.example.cristinavilas.getup.Container.actividads;
import static com.example.cristinavilas.getup.Container.alarmas;


public class Menu_Alarma extends AppCompatActivity {

    private ImageView anhadiralarma;
    private ImageView menupreferencias;
    private ListView listView;
    private ArrayList<String>aux= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__alarma);


        anhadiralarma = findViewById(R.id.anhadir);
        menupreferencias = findViewById(R.id.menu);
        listView = findViewById(R.id.listView);


        /*if(!alarmas.isEmpty()) {
            rellenarArray();
            ArrayAdapter<String> arrayAdapter;
            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, aux);
            listView.setAdapter(arrayAdapter);
        }*/

        anhadiralarma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent go = new Intent(getApplicationContext(), CrearAlarma.class);
                startActivity(go);

            }
        });
        menupreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent go = new Intent(getApplicationContext(), Preferencias_Alarma.class);
                startActivity(go);

            }
        });

    }

    private void rellenarArray() {


        aux.clear();
        for (int i = 0; i < alarmas.size(); i++) {
            aux.add(alarmas.get(i).getLugarSalida().toString());

        }


    }}
