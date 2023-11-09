package com.camilomoraleshenao.dominiocm;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursosCamilo = new ArrayList<>();

    public void agregarRecursoMorales(Recurso recurso) {
        recursosCamilo.add(recurso);
    }

    public boolean prestarRecursoMorales(Prestable prestable) {
        if (!prestable.prestarMorales()) {
            return prestable.prestarMorales();
        }
        return false;
    }


    public boolean devolverRecursoMorales(Prestable prestable) {
        if (prestable.prestarMorales()) {
            return prestable.devolverMorales();
        }
        return false;
    }



    public void listarPrestadosMorales() {
        System.out.println("Recursos prestados:");
        for (Recurso recurso : recursosCamilo) {
            if (recurso.isPrestadoCamilo()) {
                System.out.println(recurso);
            }
        }
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "recursosCamilo=" + recursosCamilo +
                '}';
    }
}

