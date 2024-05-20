package fis.etsisi.upm.es.Cartas;

import java.util.Scanner;

public class GUIMazo {
    private static GUIMazo instance;
    private Scanner scanner;

    private GUIMazo(){
        this.scanner = new Scanner(System.in);
    }

    public static GUIMazo getInstance(){
        if(instance == null) {
            instance = new GUIMazo();
        }
        return instance;
    }

    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Ver mazos");
                System.out.println("2. Nuevo mazo");
                System.out.println("3. Editar mazo");
                System.out.println("4. Eliminar mazo");
                System.out.println("0. Salir");
                option = Integer.parseInt(scanner.nextLine());
                switch(option){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
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
