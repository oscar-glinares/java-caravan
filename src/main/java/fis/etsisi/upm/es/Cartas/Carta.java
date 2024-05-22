package fis.etsisi.upm.es.Cartas;

public class Carta {
    private String id;
    private int numero;
    private Palo palo;
    private Edicion edicion;
    private int precio;

    public Carta(String id, int numero, Palo palo, Edicion edicion, int precio) {
        this.id = id;
        this.numero = numero;
        this.palo = palo;
        this.edicion = edicion;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Edicion getEdicion() {
        return edicion;
    }

    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean esFaceCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esFaceCard'");
    }

    public boolean esJoker() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esJoker'");
    }
}
