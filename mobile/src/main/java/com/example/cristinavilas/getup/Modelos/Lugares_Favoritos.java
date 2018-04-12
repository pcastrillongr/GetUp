package com.example.cristinavilas.getup.Modelos;

public class Lugares_Favoritos {

    private int idLugar;
    private String lugar;

    public Lugares_Favoritos(int idLugar, String lugar) {
        this.idLugar = idLugar;
        this.lugar = lugar;
    }

    public int getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
