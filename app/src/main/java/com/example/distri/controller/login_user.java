package com.example.distri.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.distri.Dao.DaoUsuario;
import com.example.distri.R;
import com.example.distri.model.Usuario;
import com.google.android.material.textfield.TextInputEditText;

public class login_user extends AppCompatActivity {
    private TextInputEditText correo;
    private TextInputEditText clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        this.correo=findViewById(R.id.txtcorreo);
        this.clave=findViewById(R.id.txtclave);
    }
    public void onClick(View view) {
        if (view.getId()==R.id.btniniciar){
            Usuario object=new Usuario();
            DaoUsuario dao = new DaoUsuario();

            object.setCorreo(correo.getText().toString());
            object.setClave(clave.getText().toString());
            if (dao.login(object,this)==true){
                Toast toast1= Toast.makeText(getApplicationContext(),"EL CORREO Y CLAVE CON CORRECTAS  "
                        ,Toast.LENGTH_SHORT);
                toast1.show();
                Intent viewhome = new Intent(this,home.class);
                startActivity(viewhome);

            }else{
                Toast toast1= Toast.makeText(getApplicationContext(),"CORREO O CLAVE INCORRECTAS INTENTE DENUEVO "
                        ,Toast.LENGTH_SHORT);
                toast1.show();
            }
        }
    }
}