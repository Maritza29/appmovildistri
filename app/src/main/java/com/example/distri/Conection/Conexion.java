package com.example.distri.Conection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexion  extends SQLiteOpenHelper {
    private  static final  String  database=" bd_proyecto";
    // versionde la base de datos
    private static final int version =1;
    private  static final String td_usuario="create table tb_usuario (id_usuario integer primary key autoincrement,\n" +
            "nombre text ,correo text ,clave text ,estado integer);";


    public Conexion(Context context)
    {
        super(context,database,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(td_usuario);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
