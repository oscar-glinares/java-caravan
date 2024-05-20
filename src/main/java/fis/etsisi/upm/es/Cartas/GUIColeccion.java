package fis.etsisi.upm.es.Cartas;

import java.util.Scanner;

public class GUIColeccion {
    private static GUIColeccion instance;
    private Scanner scanner;

    private GUIColeccion(){
        this.scanner = new Scanner(System.in);
    }

    public static GUIColeccion getInstance(){
        if(instance == null) {
            instance = new GUIColeccion();
        }
        return instance;
    }

    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Ver colección");
                System.out.println("0. Salir");
                option = Integer.parseInt(scanner.nextLine());
                switch(option){
                    case 1:
                        System.out.println("Ver colección");
                        break;
                    case 0:
                        System.out.println("Salir");
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
