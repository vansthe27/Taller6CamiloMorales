package com.camilomoraleshenao.dominiocm;

public class Tesis extends Recurso implements Prestable {

    public Tesis(String nombreCamilo) {
        super(nombreCamilo);
    }

    @Override
    public boolean prestarMorales() {
        if (!isPrestadoCamilo()) {
            setPrestadoCamilo(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean devolverMorales() {
        if (isPrestadoCamilo()) {
            setPrestadoCamilo(false);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Tesis: " + getNombre() + " - Prestado: " + isPrestadoCamilo();
    }
}


