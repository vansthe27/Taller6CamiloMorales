package com.camilomoraleshenao.dominiocm;

import java.util.List;

public abstract class Recurso {
    private boolean prestadoCamilo;
    private String nombreCamilo;

    public Recurso(String nombreCamilo) {
        this.nombreCamilo = nombreCamilo;
        this.prestadoCamilo = false;
    }

    public boolean isPrestadoCamilo() {
        return prestadoCamilo;
    }

    public void setPrestadoCamilo(boolean prestadoCamilo) {
        this.prestadoCamilo = prestadoCamilo;
    }

    public String getNombre() {
        return nombreCamilo;
    }


    @Override
    public String toString() {
        return "Recurso{" +
                "prestadoCamilo=" + prestadoCamilo +
                ", nombreCamilo='" + nombreCamilo + '\'' +
                '}';
    }
}


