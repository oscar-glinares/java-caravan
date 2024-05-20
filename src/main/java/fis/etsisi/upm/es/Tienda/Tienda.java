package fis.etsisi.upm.es.Tienda;

import java.util.List;

import fis.etsisi.upm.es.Cartas.Carta;
import fis.etsisi.upm.es.Jugador.Jugador;

public class Tienda {
    private Tienda instance;
    private List<Carta> stock;

    public Tienda getInstance(){
        if(instance == null) {
            instance = new Tienda();
        }
        return instance;
    }

    public void venderCarta(int precio, Jugador vendedor) {
    }

    public Carta comprarCarta(int precio, Jugador comprador) {
        return null;
    }
}
