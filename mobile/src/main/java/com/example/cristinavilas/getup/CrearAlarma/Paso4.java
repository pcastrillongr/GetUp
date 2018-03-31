package com.example.cristinavilas.getup.CrearAlarma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

import com.example.cristinavilas.getup.R;

public class Paso4 extends AppCompatActivity {


    NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso4);
        numberPicker=findViewById(R.id.numberPicker4);
        numberPicker.setMaxValue(59);
        numberPicker.setMinValue(0);
    }
}
