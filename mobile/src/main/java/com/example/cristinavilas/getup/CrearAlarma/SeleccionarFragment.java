package com.example.cristinavilas.getup.CrearAlarma;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SeleccionarFragment extends FragmentPagerAdapter {


    public SeleccionarFragment(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return Fragmento_1.newInstance(position + 1);
            case 1:
                return Fragmento_2.newInstance(position + 1);
            case 2:
                return Fragmento_3.newInstance(position + 1);
        }

        return null;

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}

