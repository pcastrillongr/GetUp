package com.example.cristinavilas.getup;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cristinavilas.getup.CrearAlarma.CrearAlarma;

public class Entrada_Juego extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada__juego);
        imageView = findViewById(R.id.imageViewInicio);
        countTimer();


    }

    private void menuInicio() {

        Intent go=new Intent(this,Menu_Alarma.class);
        startActivity(go);
    }

    private void countTimer() {

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {


            }

            @Override
            public void onFinish() {

                menuInicio();
            }
        }.start();
    }
}
