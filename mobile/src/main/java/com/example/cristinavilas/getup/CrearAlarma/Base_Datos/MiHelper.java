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

        db.execSQL("Create table Lugares(idLugar integer  primary key,Lugar String);");
        db.execSQL("Create table Actividad(idAct Integer  primary key,razon String,tiempo Integer,idAl integer,foreign key(idAl)references Alarma(idAlarma));");
        db.execSQL("Create table Alarma(idAlarma Integer primary key,Lsalida String,Lllegada String,Hsalida String,Hllegada String,id_act Integer,foreign key (id_act) references Actividad(idAct));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
