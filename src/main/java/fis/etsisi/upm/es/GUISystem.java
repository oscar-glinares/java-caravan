package fis.etsisi.upm.es;

import java.util.Scanner;

import fis.etsisi.upm.es.Juego.GUIJuego;
import fis.etsisi.upm.es.Tienda.GUITienda;

public class GUISystem {
    private static GUISystem instance;
    private Scanner scanner;

    private GUISystem(){
        this.scanner = new Scanner(System.in);
    }

    public static GUISystem getInstance(){
        if(instance == null) {
            instance = new GUISystem();
        }
        return instance;
    }
    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Jugar como invitado");
                System.out.println("3. Jugar");
                System.out.println("4. Tienda");
                System.out.println("0. Salir");
                option = Integer.parseInt(scanner.nextLine());
                switch(option){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        GUIJuego guiJuego = GUIJuego.getInstance();
                        guiJuego.showMenu();
                        break;
                    case 4:
                        GUITienda guiTienda = GUITienda.getInstance();
                        guiTienda.showMenu();
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
