package com.example.distri.interfaz;

import com.example.distri.controller.Register_user;
import com.example.distri.controller.login_user;
import com.example.distri.model.Usuario;

public interface IUsuario {
    public boolean craete(Usuario object, Register_user context);
    public boolean login(Usuario object, login_user context);
}
