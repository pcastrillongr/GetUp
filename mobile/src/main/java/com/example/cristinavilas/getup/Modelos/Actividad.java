package com.example.cristinavilas.getup.Modelos;

public class Actividad {

    private String razon;
    private int tiempo;

    public Actividad(String razon, int tiempo) {
        this.razon = razon;
        this.tiempo = tiempo;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
