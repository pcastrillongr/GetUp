package com.example.cristinavilas.getup.CrearAlarma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.example.cristinavilas.getup.R;

public class Paso_2 extends AppCompatActivity {

    private ToggleButton toggleButtonL;
    private ToggleButton toggleButtonM;
    private ToggleButton toggleButtonX;
    private ToggleButton toggleButtonJ;
    private ToggleButton toggleButtonV;
    private ToggleButton toggleButtonS;
    private ToggleButton toggleButtonD;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_crear_alarma_2);

        toggleButtonL = findViewById(R.id.lunes);
        toggleButtonM = findViewById(R.id.martes);
        toggleButtonX = findViewById(R.id.miercoles);
        toggleButtonJ = findViewById(R.id.jueves);
        toggleButtonV = findViewById(R.id.viernes);
        toggleButtonS = findViewById(R.id.sabado);
        toggleButtonD = findViewById(R.id.domingo);
        timePicker = findViewById(R.id.simpleTimePicker);


    }
}
