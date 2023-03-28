package com.example.distri.Dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.distri.Conection.Conexion;
import com.example.distri.controller.Register_user;
import com.example.distri.controller.login_user;
import com.example.distri.interfaz.IUsuario;
import com.example.distri.model.Usuario;

public class DaoUsuario implements IUsuario {
    @Override
    public boolean craete(Usuario object, Register_user context) {
        boolean respuesta = false;
        Conexion conexion = new Conexion(context);
        SQLiteDatabase consulta = conexion.getWritableDatabase();
        ContentValues registro = new ContentValues();
        registro.put("nombre", object.getNombre());
        registro.put("correo", object.getCorreo());
        registro.put("clave", object.getClave());
        registro.put("estado", object.getEstado());
        if (consulta.insert("tb_usuario", null, registro) > 0) {
            respuesta = true;
            conexion.close();
        }

        return respuesta;
    }

    @Override
    public boolean login(Usuario object, login_user context) {
        boolean respuesta =false;
        Conexion conexion=new Conexion(context);
        SQLiteDatabase consulta= conexion.getWritableDatabase();
        Cursor registro= consulta.rawQuery("select correo,clave from tb_usuario where estado=1",null);
        if (registro.moveToFirst()){
            do {
                if (registro.getString(0).equals(object.getCorreo()) && registro.getString(1).equals(object.getClave())){

                    respuesta = true;
                    conexion.close();
                }
            }while (registro.moveToNext());
        }
        return respuesta;
    }


}
