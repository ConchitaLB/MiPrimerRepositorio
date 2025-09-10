package com.Ercilla;

public record PersonaRegistro(String nombre, String apellidos) {
    public String toString(){
        //Pepito comentó la linea de código que se puede eliminar
        //System.out.println("Esta insrucción es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }
}
