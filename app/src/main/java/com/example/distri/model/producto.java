package com.example.distri.model;

public class producto {
    public int id;
    public int imagen;
    public String nombre;
    public String Des;

    public producto (int id, int imagen, String nombre, String des) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        Des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

}
