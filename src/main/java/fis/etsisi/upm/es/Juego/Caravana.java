package fis.etsisi.upm.es.Juego;

import fis.etsisi.upm.es.Cartas.Carta;

import java.util.List;

public class Caravana {
    private String nombre;
    private int suma;
    private boolean valida;
    private boolean direccion;
    private List<Carta> cartas;



    public void calcularValor() {
        int valor = 0;
        for (Carta carta : this.cartas) {
            valor += carta.getNumero();
        }

        this.suma = valor;
    }

    public void comprobarValida() {
        if (this.suma <= 26 && this.suma <= 21){
            this.valida = true;
        }
        else{
            this.valida = false;
        }
    }

}
