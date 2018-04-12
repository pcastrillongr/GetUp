package com.example.cristinavilas.getup.CrearAlarma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cristinavilas.getup.Modelos.Actividad;
import com.example.cristinavilas.getup.R;

import static com.example.cristinavilas.getup.Container.actividads;

public class AniadirActividades extends AppCompatActivity {

    private Spinner spinner;

    private String[] actividades = {"Levantarse","Desayunar", "Ducharse", "Vestirse", "Nuevo.."};
    private ImageView imageViewDespertarse;
    private ImageView imageViewDesayunar;
    private ImageView imageViewDucharse;
    private ImageView imageViewVestirse;
    private NumberPicker numberPicker;
    private int posicionSpinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniadir_actividades);


        spinner = findViewById(R.id.spinner);
        imageViewDespertarse = findViewById(R.id.imageViewDespertarse);
        imageViewDesayunar = findViewById(R.id.imageViewDesayunar);
        imageViewDucharse = findViewById(R.id.imageViewDucharse);
        imageViewVestirse= findViewById(R.id.imageViewVestirse);
        numberPicker = findViewById(R.id.numberPickerActividades);
        textView = findViewById(R.id.textViewTexto);

        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(59);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, actividades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner.setSelection(position);
                cambiarImagen(position);
                posicionSpinner=position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }


    public void cambiarImagen(int posicion){

        if(posicion == 0){
            imageViewDespertarse.setVisibility(View.VISIBLE);
            imageViewDesayunar.setVisibility(View.INVISIBLE);
            imageViewDucharse.setVisibility(View.INVISIBLE);
            imageViewVestirse.setVisibility(View.INVISIBLE);
            textView.setText("¿Cuanto tardas en levantarte?");
        }
        if(posicion==1){

            imageViewDespertarse.setVisibility(View.INVISIBLE);
            imageViewDesayunar.setVisibility(View.VISIBLE);
            imageViewDucharse.setVisibility(View.INVISIBLE);
            imageViewVestirse.setVisibility(View.INVISIBLE);
            textView.setText("¿Cuanto tardas en desayunar?");
        }

        if(posicion==2){

            imageViewDespertarse.setVisibility(View.INVISIBLE);
            imageViewDesayunar.setVisibility(View.INVISIBLE);
            imageViewDucharse.setVisibility(View.VISIBLE);
            imageViewVestirse.setVisibility(View.INVISIBLE);
            textView.setText("¿Cuanto tardas en el baño?");
        }

        if(posicion==3){

            imageViewDespertarse.setVisibility(View.INVISIBLE);
            imageViewDesayunar.setVisibility(View.INVISIBLE);
            imageViewDucharse.setVisibility(View.INVISIBLE);
            imageViewVestirse.setVisibility(View.VISIBLE);
            textView.setText("¿Cuanto tardas en vestirse?");
        }
        if(posicion == actividades.length-1){


            imageViewDespertarse.setVisibility(View.INVISIBLE);
            imageViewDesayunar.setVisibility(View.INVISIBLE);
            imageViewDucharse.setVisibility(View.INVISIBLE);
            imageViewVestirse.setVisibility(View.VISIBLE);
            textView.setText("¿Cuanto tardas en vestirse?");

        }

    }

    public void guardar(View view){

        Actividad actividad = new Actividad(null,actividades[posicionSpinner].toString(),numberPicker.getValue());
        actividads.add(actividad);

        onBackPressed();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this,CrearAlarma.class);
        startActivity(i);
    }
}
