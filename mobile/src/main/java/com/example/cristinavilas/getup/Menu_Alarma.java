package com.example.cristinavilas.getup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cristinavilas.getup.CrearAlarma.CrearAlarma;

public class Menu_Alarma extends AppCompatActivity {

    ImageView  anhadiralarma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__alarma);

        anhadiralarma=(ImageView) findViewById(R.id.anhadir);
        anhadiralarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent go=new Intent(getApplicationContext(), CrearAlarma.class);
                startActivity(go);

            }
        });
    }
}
