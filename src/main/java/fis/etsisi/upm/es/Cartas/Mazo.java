package fis.etsisi.upm.es.Cartas;

import java.util.Collections;
import java.util.List;

public class Mazo {
    private String id;
    private int maximoCartas = 56;
    private int minimoCartas = 30;
    private List<Carta> cartas;

    public Mazo(String id, List<Carta> cartas) {
        this.id = id;
        this.cartas = cartas;
    }

    public void anadirCarta(Carta carta) {
        this.cartas.add(carta);
    }

    public void eliminarCarta(Carta carta) {
        this.cartas.remove(carta);
    }

    public void mostrarMazo() {
        for (Carta carta : this.cartas) {
            System.out.println(carta);
        }
    }

    public void vaciarMazo() {
        this.cartas.clear();
    }

    public List<Carta> getMazo() {
        return this.cartas;
    }

    public void setMazo(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getMaximoCartas() {
        return this.maximoCartas;
    }

    public int getMinimoCartas() {
        return this.minimoCartas;
    }
    public void baraJar() {
        Collections.shuffle(cartas);
    }
}
