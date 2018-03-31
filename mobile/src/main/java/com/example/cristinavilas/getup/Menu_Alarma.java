package com.example.cristinavilas.getup;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cristinavilas.getup.CrearAlarma.CrearAlarma;

public class Menu_Alarma extends AppCompatActivity {

    ImageView  anhadiralarma;
    ImageView  menupreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__alarma);


        anhadiralarma=(ImageView) findViewById(R.id.anhadir);
        menupreferencias=(ImageView)findViewById(R.id.menu);
        anhadiralarma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent go=new Intent(getApplicationContext(), CrearAlarma.class);
                startActivity(go);

            }
        });
        menupreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent go=new Intent(getApplicationContext(), Preferencias_Alarma.class);
                startActivity(go);

            }
        });

    }


}
