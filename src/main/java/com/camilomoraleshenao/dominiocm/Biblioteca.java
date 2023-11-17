package com.camilomoraleshenao.dominiocm;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursosCamilo = new ArrayList<>();
    private List<Recurso> recursosPrestadosCamilo = new ArrayList<>();

    public void agregarRecursoMorales(Recurso recurso) {
        recursosCamilo.add(recurso);
    }

    public boolean prestarRecursoMorales(Prestable prestable) {
        if (prestable.prestarMorales()) {
            recursosPrestadosCamilo.add((Recurso) prestable);
            return true;
        } else {
            System.out.println("El recurso ya está prestado");
            return false;
        }
    }



    public boolean devolverRecursoMorales(Prestable prestable) {
        boolean devuelto = prestable.devolverMorales();
        if (devuelto) {
            recursosPrestadosCamilo.remove((Recurso) prestable);
        }
        return devuelto;
    }



    public void listarPrestadosMorales() {
        System.out.println("Recursos prestados: ");
        for (Recurso recurso : recursosPrestadosCamilo) {
            System.out.println(recurso);
        }
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "recursosCamilo=" + recursosCamilo +
                '}';
    }
}

