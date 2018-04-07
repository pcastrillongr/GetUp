package com.example.cristinavilas.getup.CrearAlarma.Fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.cristinavilas.getup.R;

import java.util.ArrayList;

import static com.example.cristinavilas.getup.CrearAlarma.Fragmentos.SeleccionarFragment.AniadirActividades.actividads;

public class Fragmento_Paso_3 extends Fragment {

    private Button btnAniadir;
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
        listView = rootView.findViewById(R.id.listView);

        RellenarArray();
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, aux);

        listView.setAdapter(arrayAdapter);

        btnAniadir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent i = new Intent(getContext(), SeleccionarFragment.AniadirActividades.class);
                startActivity(i);

            }

        });


        return rootView;
    }

    private String[] RellenarArray() {
        String[] auxiliar2 ={""};

        if(!actividads.isEmpty()) {
            for( int i = 0 ; i < actividads.size();i++) {
                aux.add(actividads.get(i).getRazon().toString() + " " + actividads.get(i).getTiempo()+" Minutos");
            }

        }

        return auxiliar2;

    }


}
