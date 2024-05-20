package fis.etsisi.upm.es;

public class Sesion {
    private Sesion instance;

    public Sesion getInstance(){
        if(instance == null) {
            instance = new Sesion();
        }
        return instance;
    }

}
