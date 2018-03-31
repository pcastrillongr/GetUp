package com.example.cristinavilas.getup.Modelos;

import com.example.cristinavilas.getup.Modelos.Actividad;

import java.time.LocalTime;
import java.util.ArrayList;

public class Alarma {

    private int id_alarma;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private ArrayList<Actividad> actividades;

    public Alarma(int id_alarma,String lugarSalida, String lugarLlegada, LocalTime horaLlegada) {
        this.id_alarma=id_alarma;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.horaLlegada = horaLlegada;
        actividades = new ArrayList<Actividad>();
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
}
