package com.example.cristinavilas.getup.CrearAlarma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
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
    private NumberPicker numberpicker;
    private ImageView siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paso2);

        toggleButtonL = findViewById(R.id.lunes);
        toggleButtonM = findViewById(R.id.martes);
        toggleButtonX = findViewById(R.id.miercoles);
        toggleButtonJ = findViewById(R.id.jueves);
        toggleButtonV = findViewById(R.id.viernes);
        toggleButtonS = findViewById(R.id.sabado);
        toggleButtonD = findViewById(R.id.domingo);
        numberpicker = findViewById(R.id.numberPicker2);
        siguiente=(ImageView)findViewById(R.id.next2);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(getApplicationContext(),Paso_3.class);
                startActivity(go);
            }
        });
        numberpicker.setMaxValue(59);
        numberpicker.setMinValue(0);


    }
}
