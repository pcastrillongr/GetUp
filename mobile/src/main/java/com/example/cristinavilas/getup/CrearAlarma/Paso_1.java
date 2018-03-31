package com.example.cristinavilas.getup.CrearAlarma;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cristinavilas.getup.R;

import java.io.IOException;
import java.util.ArrayList;

public class Paso_1 extends AppCompatActivity {

    private EditText salida;
    private EditText llegada;
    private ImageView siguiente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.paso1);

        siguiente=(ImageView)findViewById(R.id.next);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent go=new Intent(getApplicationContext(),Paso_2.class);
                startActivity(go);
            }
        });
        salida = findViewById(R.id.salida);
        llegada = findViewById(R.id.llegada);





    }






}
