package fis.etsisi.upm.es.Juego;

import fis.etsisi.upm.es.Cartas.Carta;
import fis.etsisi.upm.es.Jugador.Jugador;

public class Mesa {
    private Jugador[] jugadores = new Jugador[2];
    private int numJugadores;
    private int bote;
    private Caravana[][] caravanas = new Caravana[2][3];
    private static Mesa instance;

    private Mesa() {
        numJugadores = 0;
        bote = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                caravanas[i][j] = new Caravana("Caravana " + (j+1));
            }
        }
    }

    public Mesa getInstance() {
        if(instance == null) {
            instance = new Mesa();
        }
        return instance;
    }

    public void jugarCarta(Jugador jugador, Carta carta, int caravanaIndex) {
            int jugadorIndex = (jugador == jugadores[0]) ? 0 : 1;
            if (carta.esFaceCard() || carta.esJoker()) {
                // The player can play the card on any caravan
                caravanas[jugadorIndex][caravanaIndex].addCarta(carta);
            } else {
                // The player can only play the card on their own caravans
                caravanas[jugadorIndex][caravanaIndex].addCarta(carta);
            }
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