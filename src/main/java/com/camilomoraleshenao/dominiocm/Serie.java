package com.camilomoraleshenao.dominiocm;

public class Serie extends Recurso{

    public Serie(String nombreCamilo) {
        super(nombreCamilo);
    }

    @Override
    public String toString() {
        return "Serie: " + getNombre() + " - Prestado: " + isPrestadoCamilo();
    }
}
