package fis.etsisi.upm.es.Juego;

import fis.etsisi.upm.es.Jugador.Jugador;

public class Mesa {
    private Jugador[] jugadores = new Jugador[2];
    private int numJugadores;
    private int bote;
    private static Mesa instance;

    private Mesa() {
        numJugadores = 0;
        bote = 0;
    }

    public Mesa getInstance() {
        if(instance == null) {
            instance = new Mesa();
        }
        return instance;
    }

    public void nuevaRonda() {

    }

    public void iniciarPartida() {

    }

    public void aniadirJugador(Jugador jugador) {
        if(numJugadores < 2) {
            jugadores[numJugadores] = jugador;
            numJugadores++;
        }
    }

    public void terminarPartida() {

    }
}