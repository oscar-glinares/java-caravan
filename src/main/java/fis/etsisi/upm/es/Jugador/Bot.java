package fis.etsisi.upm.es.Jugador;

import java.util.List;

import fis.etsisi.upm.es.Cartas.Coleccion;
import fis.etsisi.upm.es.Cartas.Mano;
import fis.etsisi.upm.es.Cartas.Mazo;

public class Bot extends Jugador {
    public Bot(String id, String nombre) {
        super(id, nombre);
    }
    public void jugar() {

    }

    public int apostar(){
        int chapas;
        chapas = this.getNumChapas()/2;
        this.setNumChapas(this.getNumChapas() - chapas);
        return chapas;
    }
}
