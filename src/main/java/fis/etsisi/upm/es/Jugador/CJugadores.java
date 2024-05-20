package fis.etsisi.upm.es.Jugador;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class CJugadores {
    private static CJugadores instance;
    private static final String NOMBRE = "nombre";
    private List<Jugador> jugadores;

    public static CJugadores getInstance() {
        if (instance == null) {
            instance = new CJugadores();
        }
        return instance;
    }

    private CJugadores() {
    }

    public void crearJugador(HashMap<String, String> datos) {
        String nombre = datos.get(NOMBRE);
        String id = UUID.randomUUID().toString();
        Jugador jugador = new Jugador(id, nombre);
        addJugador(jugador);
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(String id) {
        for (Jugador jugador : jugadores) {
            if (jugador.getId().equals(id)) {
                jugadores.remove(jugador);
                break;
            }
        }
    }

    public void verJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
