package com.example.cristinavilas.getup.CrearAlarma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.cristinavilas.getup.R;

public class Paso_1 extends AppCompatActivity {

    private EditText salida;
    private EditText llegada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_crear_alarma);

        salida = findViewById(R.id.salida);
        llegada = findViewById(R.id.llegada);

    }
}