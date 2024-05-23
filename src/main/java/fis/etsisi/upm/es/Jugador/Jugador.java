package fis.etsisi.upm.es.Jugador;

import java.util.List;
import java.util.Scanner;

import fis.etsisi.upm.es.Cartas.Coleccion;
import fis.etsisi.upm.es.Cartas.Mano;
import fis.etsisi.upm.es.Cartas.Mazo;

public class Jugador {
    private String id;
    private String nombre;
    private int numChapas;
    private int victorias;
    private int derrotas;
    private List<Mazo> mazos;
    private Coleccion coleccion;
    private Mano mano;

    public Jugador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.numChapas = 500;
        this.victorias = 0;
        this.derrotas = 0;
    }
    public void jugar() {

    }

    public int apostar() {
        int chapas;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de chapas a apostar:");
        chapas = scanner.nextInt();
        while (chapas > this.numChapas) {
            System.out.println("No puedes apostar más chapas de las que tienes. Introduce una cantidad válida:");
            chapas = scanner.nextInt();
        }
        this.numChapas -= chapas;
        return chapas;
    }

    public void empezarPartida() {

    }

    public void ganar() {
        this.victorias++;
    }

    public void perder() {
        this.derrotas++;
    }

    public void apostar(int chapas) {
        this.numChapas = this.numChapas - chapas;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumChapas() {
        return numChapas;
    }
    public void setNumChapas(int numChapas) {
        this.numChapas = numChapas;
    }
    public int getVictorias() {
        return victorias;
    }
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public List<Mazo> getMazos() {
        return mazos;
    }
    public void setMazos(List<Mazo> mazos) {
        this.mazos = mazos;
    }
    public Coleccion getColeccion() {
        return coleccion;
    }
    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }
    public Mano getMano() {
        return mano;
    }
    public void setMano(Mano mano) {
        this.mano = mano;
    }
}

