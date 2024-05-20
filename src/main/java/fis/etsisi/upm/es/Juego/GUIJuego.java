package fis.etsisi.upm.es.Juego;

import java.util.Scanner;

public class GUIJuego {
    private static GUIJuego instance;
    private Scanner scanner;

    private GUIJuego(){
        this.scanner = new Scanner(System.in);
    }

    public static GUIJuego getInstance(){
        if(instance == null) {
            instance = new GUIJuego();
        }
        return instance;
    }
    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Configurar mazo");
                System.out.println("2. Configurar jugadores");
                System.out.println("3. Empezar partida");
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
