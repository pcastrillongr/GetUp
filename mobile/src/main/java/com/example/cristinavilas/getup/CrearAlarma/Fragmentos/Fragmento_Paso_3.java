package com.example.cristinavilas.getup.CrearAlarma.Fragmentos;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.cristinavilas.getup.CrearAlarma.AniadirActividades;
import com.example.cristinavilas.getup.Menu_Alarma;
import com.example.cristinavilas.getup.Modelos.Alarma;
import com.example.cristinavilas.getup.R;
import java.util.ArrayList;

import static com.example.cristinavilas.getup.Container.actividads;
import static com.example.cristinavilas.getup.Container.alarmas;


public class Fragmento_Paso_3 extends Fragment {

    private Button btnAniadir;
    private Button btnTerminar;
    private ListView listView;
    private ArrayList<String> aux = new ArrayList<String>();


    private static final String ARG_SECTION_NUMBER = "section_number";

    public Fragmento_Paso_3() {
    }

    public static Fragmento_Paso_3 newInstance(int sectionNumber) {
        Fragmento_Paso_3 fragment = new Fragmento_Paso_3();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_crear__alarma_3, container, false);
        btnAniadir = rootView.findViewById(R.id.btnAniadir);
        btnTerminar= rootView.findViewById(R.id.btnTerminar);
        listView = rootView.findViewById(R.id.listView);

        rellenarArray();
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, aux);
        listView.setAdapter(arrayAdapter);

        btnAniadir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent i = new Intent(getContext(),AniadirActividades.class);
                startActivity(i);

            }

        });

        btnTerminar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Alarma alarma = new Alarma();
                alarma.setLugarSalida("Malaga");
                alarmas.add(alarma);


                Intent i = new Intent(getContext(), Menu_Alarma.class);
                startActivity(i);
            }


        });

        return rootView;
    }

    private String[] rellenarArray() {
        String[] auxiliar2 ={""};

        if(!actividads.isEmpty()) {
            aux.clear();
            for( int i = 0 ; i < actividads.size();i++) {

                aux.add(actividads.get(i).getRazon().toString() + " " + actividads.get(i).getTiempo()+" Minutos");
            }

        }

        return auxiliar2;

    }


}
