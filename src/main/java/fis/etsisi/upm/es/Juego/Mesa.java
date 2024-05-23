package fis.etsisi.upm.es.Juego;

import fis.etsisi.upm.es.Cartas.Carta;
import fis.etsisi.upm.es.Jugador.Jugador;

public class Mesa {
    private Jugador jugador1;
    private Jugador jugador2;
    private int bote;
    private Caravana[][] caravanas = new Caravana[2][3];
    private static Mesa instance;

    private Mesa() {
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
    }

    public void nuevaRonda() {

    }

    public void iniciarPartida() {
        boolean sigueApostando = true;
        while(sigueApostando){
            sigueApostando = rondaDeApuestas();
        }

        boolean sigueJugando = true;
        while(sigueJugando){
            sigueJugando = rondaDeJuego();
        }
    }

    public void rondaDeApuestas() {
        int apuesta = jugador2.apostar(); // El jugador 2 hace la primera apuesta
        System.out.println("Jugador 2 ha apostado " + apuesta + " chapas.");

        int respuesta = jugador1.apostar(); // El jugador 1 decide si subir la apuesta, igualarla o retirarse
        if (respuesta > apuesta) {
            System.out.println("Jugador 1 ha subido la apuesta a " + respuesta + " chapas.");
            apuesta = respuesta;
        } else if (respuesta == apuesta) {
            System.out.println("Jugador 1 ha igualado la apuesta.");
        } else {
            System.out.println("Jugador 1 se ha retirado.");
            return;
        }

        respuesta = jugador2.apostar(); // El jugador 2 decide si subir la apuesta, igualarla o retirarse
        if (respuesta > apuesta) {
            System.out.println("Jugador 2 ha subido la apuesta a " + respuesta + " chapas.");
            apuesta = respuesta;
        } else if (respuesta == apuesta) {
            System.out.println("Jugador 2 ha igualado la apuesta.");
        } else {
            System.out.println("Jugador 2 se ha retirado.");
            return;
        }

        respuesta = jugador1.apostar(); // El jugador 1 tiene una última oportunidad para subir la apuesta, igualarla o retirarse
        if (respuesta > apuesta) {
            System.out.println("Jugador 1 ha subido la apuesta a " + respuesta + " chapas.");
        } else if (respuesta == apuesta) {
            System.out.println("Jugador 1 ha igualado la apuesta.");
        } else {
            System.out.println("Jugador 1 se ha retirado.");
        }
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