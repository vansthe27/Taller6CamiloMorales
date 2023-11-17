package com.camilomoraleshenao.appcm;

import com.camilomoraleshenao.dominiocm.*;

public class AplicacionBiblioteca {
    public static void main(String[] args) {
        Biblioteca remington = new Biblioteca();

        Libro libro = new Libro("La guerra del fin del mundo");
        Revista revista = new Revista("Aprende Java");
        Tesis tesis = new Tesis("Investigación sobre Phishing");
        Dvd dvd = new Dvd("Terminator");
        Serie serie = new Serie("The Last Kingdom");

        remington.agregarRecursoMorales(libro);
        remington.agregarRecursoMorales(revista);
        remington.agregarRecursoMorales(tesis);
        remington.agregarRecursoMorales(dvd);
        remington.agregarRecursoMorales(serie);


        Prestable[] recursos = {libro, revista,dvd, revista};
        for (Prestable recurso : recursos) {
            if (remington.prestarRecursoMorales(recurso)) {
                System.out.println("Se prestó correctamente: " + recurso);
            } else {
                System.out.println("No se pudo prestar: " + recurso);
            }
        }


        for (Prestable recurso : recursos) {
            if (remington.devolverRecursoMorales(recurso)) {
                System.out.println("Se devolvió correctamente: " + recurso);
            } else {
                System.out.println("No se pudo devolver: " + recurso);
            }
        }
    }
}
