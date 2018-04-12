package com.example.cristinavilas.getup.CrearAlarma.Base_Datos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

public class MiHelper extends SQLiteOpenHelper {

    public MiHelper(Context context, String name, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db ) {

        db.execSQL("Create table Lugares(idLugar integer,Lugar String);");
        db.execSQL("Create table Actividad(idAct Integer,idAl integer,razon String,tiempo Integer,foreign key(actividad)references Alarma) ;");
        db.execSQL("Create table Alarma(Lsalida String,Lllegada String,Hsalida String,Hllegada String,Actividad Integer,foreign key (actividad) references Actividad);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
}
