package com.Ercilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.SolicitarDatos("Introduce tu nombre: ");
        msg.saludar(nombre);
    }
}