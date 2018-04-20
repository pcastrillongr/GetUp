package com.example.cristinavilas.getup.CrearAlarma.Fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.cristinavilas.getup.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

public class Fragmento_Paso_1 extends Fragment {

    private EditText salida;
    private EditText llegada;
    private MapView mapa;
    private GoogleMap googleMap;
    private static final String ARG_SECTION_NUMBER = "section_number";

    public Fragmento_Paso_1() {
    }

    public static Fragmento_Paso_1 newInstance(int sectionNumber) {
        Fragmento_Paso_1 fragment = new Fragmento_Paso_1();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_crear_alarma, container, false);
        salida = rootView.findViewById(R.id.editText);
        llegada = rootView.findViewById(R.id.editText2);
        mapa = rootView.findViewById(R.id.mapView);


        return rootView;
    }
}
