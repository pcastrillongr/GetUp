package com.example.cristinavilas.getup.CrearAlarma;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.TimePicker;


import com.example.cristinavilas.getup.CrearAlarma.Fragmentos.SeleccionarFragment;
import com.example.cristinavilas.getup.Menu_Alarma;
import com.example.cristinavilas.getup.Modelos.Alarma;
import com.example.cristinavilas.getup.R;

import static com.example.cristinavilas.getup.Container.actividads;
import static com.example.cristinavilas.getup.Container.alarmas;


public class CrearAlarma extends AppCompatActivity {


    private SeleccionarFragment seleccionarFragment;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_alarma);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        seleccionarFragment = new SeleccionarFragment(getSupportFragmentManager());



        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(seleccionarFragment);

        TabLayout tabLayout = findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        actividads.clear();
        Intent i = new Intent(this, Menu_Alarma.class);
        startActivity(i);
    }


}