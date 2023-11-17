package com.camilomoraleshenao.dominiocm;

public class Tesis extends Recurso{

    public Tesis(String nombreCamilo) {
        super(nombreCamilo);
    }

    @Override
    public String toString() {
        return "Tesis: " + getNombre() + " - Prestado: " + isPrestadoCamilo();
    }
}


