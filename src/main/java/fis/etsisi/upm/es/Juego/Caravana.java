package fis.etsisi.upm.es.Juego;

import fis.etsisi.upm.es.Cartas.Carta;

import java.util.List;

public class Caravana {
    private String nombre;
    private int suma;
    private boolean valida;
    private TDireccion direccion;
    private List<Carta> cartas;

    public Caravana(String nombre) {
        this.nombre = nombre;
        this.cartas = null;
        this.suma = 0;
        this.valida = false;
        this.direccion = TDireccion.NEUTRAL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public TDireccion getDireccion() {
        return direccion;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

public void calcularValor() {
        int valor = 0;
        int ultimoValorNoFigura = 0;
        for (Carta carta : this.cartas) {
            if (carta.getNumero() <= 10) {
                valor += carta.getNumero();
                ultimoValorNoFigura = carta.getNumero();
            }
            else {
                int valorMultiplicado = 0;
                valorMultiplicado = ultimoValorNoFigura*2;
                valor -= ultimoValorNoFigura;
                valor += valorMultiplicado;
                ultimoValorNoFigura = valorMultiplicado;
            }
        }
        this.suma = valor;
        comprobarValida();
    }

    public void comprobarValida() {
        if (this.suma <= 26 && this.suma <= 21){
            this.valida = true;
        }
        else{
            this.valida = false;
        }
    }

    public void direccionAscendente() {
        this.direccion = TDireccion.ASCENDENTE;
    }

    public void direccionDescendente() {
        this.direccion = TDireccion.DESCENDENTE;
    }

    public void direccionNeutral() {
        this.direccion = TDireccion.NEUTRAL;
    }

    public void mostrarCartas() {
        for (Carta carta : this.cartas) {
            System.out.println(carta.toString());
        }
    }
    
    public void mostrarCaravana() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Suma: " + this.suma);
        System.out.println("Valida: " + this.valida);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Cartas: ");
        mostrarCartas();
    }

    public void addCarta(Carta carta) {
        if (this.cartas.isEmpty()) {
            this.cartas.add(carta);
            this.direccion = TDireccion.NEUTRAL;
        } else {
            Carta ultimaCarta = this.cartas.get(this.cartas.size() - 1);
            switch (this.direccion) {
                case ASCENDENTE:
                    if (carta.getNumero() > ultimaCarta.getNumero() || carta.getPalo().equals(ultimaCarta.getPalo())) {
                        this.cartas.add(carta);
                    }
                    break;
                case DESCENDENTE:
                    if (carta.getNumero() < ultimaCarta.getNumero() || carta.getPalo().equals(ultimaCarta.getPalo())) {
                        this.cartas.add(carta);
                    }
                    break;
                case NEUTRAL:
                    this.cartas.add(carta);
                    if (carta.getNumero() > ultimaCarta.getNumero()) {
                        this.direccion = TDireccion.ASCENDENTE;
                    } else if (carta.getNumero() < ultimaCarta.getNumero()) {
                        this.direccion = TDireccion.DESCENDENTE;
                    }
                    break;
            }
        }
    }

    public void removeCarta(Carta carta) {
        this.cartas.remove(carta);
    }
}
