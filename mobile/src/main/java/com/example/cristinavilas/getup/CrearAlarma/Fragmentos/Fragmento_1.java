package com.example.cristinavilas.getup.CrearAlarma.Fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cristinavilas.getup.R;

public class Fragmento_1 extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    public Fragmento_1() {
    }

    public static Fragmento_1 newInstance(int sectionNumber) {
        Fragmento_1 fragment = new Fragmento_1();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_crear_alarma, container, false);

        return rootView;
    }
}
