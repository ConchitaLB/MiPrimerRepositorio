package com.Ercilla;

public class persona {

    private  String nombre, apellidos;
    public persona (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


}
