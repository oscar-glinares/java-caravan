package fis.etsisi.upm.es.Tienda;

import java.util.Scanner;

public class GUITienda {
    private static GUITienda instance;
    private Scanner scanner;

    private GUITienda(){
        this.scanner = new Scanner(System.in);
    }

    public static GUITienda getInstance() {
        if (instance == null) {
            instance = new GUITienda();
        }
        return instance;
    }

    public void showMenu() {
        int option = 1;
        while(option != 0){
            try{
                System.out.println("1. Comprar");
                System.out.println("2. Vender");
                System.out.println("3. Ver inventario");
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
