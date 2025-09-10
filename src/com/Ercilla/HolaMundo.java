package com.Ercilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.SolicitarDatos("Introduce tu nombre: ");
        String apellidos = msg.SolicitarDatos("Introduce tus apellidos: ");
        persona p1 = new persona(nombre, apellidos);
        msg.saludar(p1);
    }
}