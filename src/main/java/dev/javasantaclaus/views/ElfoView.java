package dev.javasantaclaus.views;

import java.util.List;

import dev.javasantaclaus.controllers.ToyController;
import dev.javasantaclaus.dtos.BadToyDto;
import dev.javasantaclaus.dtos.GoodToyDto;
import dev.javasantaclaus.models.BadToy;
import dev.javasantaclaus.models.GoodToy;


public class ElfoView extends View {
    private static final ToyController controller = new ToyController();

    
    public static void index() {
        boolean programRuning = true;
        while(programRuning){
            System.out.println("-------------------------"); 
            System.out.println("Gestor de juguetes (Tipo de sesión: Elfo)");   
            System.out.println("1. Añadir juguetes");       
            System.out.println("2. Ver todos los juguetes");  
            System.out.println("3. Eliminar juguetes");       
            System.out.println("4. Cerrar sesión"); 
            System.out.print("Seleccione una opción: ");  
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    selectChild(); 
                    break;  
                case 2:
                    showAllToys();                      
                    break;
                case 3:
                    deleteToy();
                    System.out.println("3. Eliminar juguetes");       
                    break;
                case 4:                    
                    programRuning = false;
                    closeSession();                 
                    break;
                
                default:
                    System.out.println("La opción: "+ option + " es incorrecta");
                    break;
            }
        }           
            
    }

    public static void selectChild(){
        boolean programRuning = true;
        while(programRuning){
            System.out.println("-------------------------"); 
            System.out.println("Para niño");   
            System.out.println("1. Bueno");       
            System.out.println("2. Malo");  
            System.out.println("3. salir"); 
            System.out.print("Seleccione una opción: ");  
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    postGoodToy();
                    break;  
                case 2:    
                    postBadToy();
                    break;

                case 3:    
                    programRuning=false; 
                    break;
                                
                default:
                    System.out.println("La opción: "+ option + " es incorrecta");
                    break;
            }
        }
    }

    public static void postGoodToy() {
        System.out.println("**********************************");
        System.out.println("Añadiendo juguetes para niño bueno");
        System.out.print("Ingrese el título: ");
        String title = scanner.next();
        System.out.print("Ingrese la marca: ");
        String brand = scanner.next();
        System.out.print("Ingrese la edad: ");
        int recommendedAge = scanner.nextInt();
        System.out.print("Ingrese la categoría: ");
        String category = scanner.next();
        
        controller.postGoodToy(new GoodToyDto(title, brand, recommendedAge, category));    
                
    }


    public static void postBadToy() {
        System.out.println("**********************************");
        System.out.println("Añadiendo juguetes para niño malo: ");
        System.out.print("Ingrese el título: ");
        String title = scanner.next();
        System.out.print("Ingrese el contenido: ");
        String content = scanner.next();
                
        controller.postBadToy(new BadToyDto(title,content));    
                
    }

    public static void addToyResponse(){
        System.out.println("**********************************");
        System.out.println("Juguete añadido con éxito");
        index();
    }

    public static void showAllToys(){
        controller.getAllToys();
    }



    public static void displayToys(List<GoodToy> goodToys, List<BadToy> badToys) {
        System.out.println("**********************************");
        System.out.println("Juguetes Buenos:");
        for (GoodToy toy : goodToys) {
            System.out.println(toy);
        }

        System.out.println("**********************************");
        System.out.println("Juguetes Malos:");
        for (BadToy toy : badToys) {
            System.out.println(toy);
        }
    }

    public static void showGodToys(){
        controller.getGoodToys();
    }


    public static void deleteToy() {
        //mostrar las 2 listas
        System.out.println("***********************************");
        System.out.println("Ingrese el identificador a eliminar");
        String id = scanner.next();
        if(id.contains("B")) {
            controller.deleteGoodToy(id);

        }            
        else{
            controller.deleteBadToy(id);
        }
            
        
    }

    public static void closeSession(){
        System.out.println("********************************************");
        System.out.println("********** Sesión Elfo cerrada *************");
        System.out.println("********************************************");
        HomeView.index();
    }


}
