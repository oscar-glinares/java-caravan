package fis.etsisi.upm.es.Jugador;

import java.util.Scanner;

public class GUIJugador {
    private static GUIJugador instance;
    private Scanner scanner;

    private GUIJugador(){
        this.scanner = new Scanner(System.in);
    }

    public static GUIJugador getInstance(){
        if(instance == null) {
            instance = new GUIJugador();
        }
        return instance;
    }
    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Crear jugador");
                System.out.println("2. Eliminar jugador");
                System.out.println("3. Ver jugadores");
                System.out.println("0. Salir");
                option = Integer.parseInt(scanner.nextLine());
                switch(option){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }
}
