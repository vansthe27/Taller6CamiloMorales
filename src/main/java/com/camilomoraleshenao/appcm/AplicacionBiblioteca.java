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



        if (libro instanceof Prestable) {
            remington.prestarRecursoMorales((Prestable) libro);
        }

        if (revista instanceof Prestable) {
            remington.prestarRecursoMorales((Prestable) revista);
        }

        if (tesis instanceof Prestable) {
            remington.prestarRecursoMorales((Prestable) tesis);
        }

        if (dvd instanceof Prestable) {
            remington.prestarRecursoMorales((Prestable) dvd);
        }

        if (serie instanceof Prestable) {
            System.out.println("Este recurso no se puede prestar");
        }


        remington.listarPrestadosMorales();



        if (libro instanceof Prestable) {
            remington.devolverRecursoMorales((Prestable) libro);
        }

        if (revista instanceof Prestable) {
            remington.devolverRecursoMorales((Prestable) revista);
        }

        if (tesis instanceof Prestable) {
            remington.devolverRecursoMorales((Prestable) tesis);
        }

        if (dvd instanceof Prestable) {
            remington.devolverRecursoMorales((Prestable) dvd);
        }

        remington.listarPrestadosMorales();
    }
}
