package com.example.cristinavilas.getup.CrearAlarma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;

import com.example.cristinavilas.getup.R;

public class Paso_3 extends AppCompatActivity {

    private ImageView next;
    private NumberPicker numberPicker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paso3);

       /* next=(ImageView)findViewById(R.id.next3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go=new Intent(getApplicationContext(),Paso4.class);
                startActivity(go);
            }
        });
    numberPicker3=findViewById(R.id.numberPicker3);
    numberPicker3.setMinValue(0);
    numberPicker3.setMaxValue(59);*/

    }


}