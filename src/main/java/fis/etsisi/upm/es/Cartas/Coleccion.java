package fis.etsisi.upm.es.Cartas;

import java.util.List;

public class Coleccion {
    private List<Carta> coleccion;
    private static Coleccion instance;

    public void anadirCarta(Carta carta) {
        this.coleccion.add(carta);
    }

    public void eliminarCarta(Carta carta) {
        this.coleccion.remove(carta);
    }

    public void mostrarColeccion() {
        for (Carta carta : this.coleccion) {
            System.out.println(carta);
        }
    }
}
