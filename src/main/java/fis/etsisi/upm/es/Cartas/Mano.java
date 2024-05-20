package fis.etsisi.upm.es.Cartas;

import java.util.List;

public class Mano {
    private List<Carta> mano;

    public Mano(List<Carta> mano) {
        this.mano = mano;
    }

    public void anadirCarta(Carta carta) {
        this.mano.add(carta);
    }

    public void eliminarCarta(Carta carta) {
        this.mano.remove(carta);
    }

    public void mostrarMano() {
        for (Carta carta : this.mano) {
            System.out.println(carta);
        }
    }

    public void vaciarMano() {
        this.mano.clear();
    }

    public List<Carta> getMano() {
        return this.mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }
}
