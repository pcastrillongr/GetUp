package com.example.cristinavilas.getup.CrearAlarma;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cristinavilas.getup.R;

public class Fragmento_2 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public Fragmento_2() {
    }

    public static Fragmento_2 newInstance(int sectionNumber) {
        Fragmento_2 fragment = new Fragmento_2();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_crear_alarma_2, container, false);

        return rootView;
    }
}

