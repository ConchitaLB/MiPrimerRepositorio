package com.Ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public String toString(){
        System.out.println("Esta insrucción es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }
}
