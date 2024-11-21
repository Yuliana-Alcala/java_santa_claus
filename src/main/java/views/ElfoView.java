package views;

import controllers.ToyController;
import dtos.GoodToyDto;
;

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
            System.out.println("Seleccione una opción: ");  
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    selectChild(); 
                    break;  
                case 2:    
                    System.out.println("2. Ver todos los juguetes");  
                    break;
                case 3:
                    System.out.println("3. Eliminar juguetes");       
                    break;
                case 4:
                    System.out.println("********** Sesión Elfo cerrada *************");
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
            System.out.println("Seleccione una opción: ");  
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    postGoodToy();
                    break;  
                case 2:    
                    System.out.println("2. Añadir juguetes niño malo");  
                    break;

                case 3:    
                    System.out.println("3. salir"); 
                    programRuning=false; 
                    break;
                                
                default:
                    System.out.println("La opción: "+ option + " es incorrecta");
                    break;
            }
        }
    }

    public static void postGoodToy() {
        System.out.println("Añadiendo juguetes para niño bueno");
        System.out.println("Ingrese el título");
        String title = scanner.next();
        System.out.println("Ingrese la marca");
        String brand = scanner.next();
        System.out.println("Ingrese la edad recomendada");
        int recommendedAge = scanner.nextInt();
        System.out.println("Ingrese la categoría");
        String category = scanner.next();
        
        controller.postGoodToy(new GoodToyDto(title, brand, recommendedAge, category));    
                
    }

    public static void addToyResponse(){
        System.out.println("Juguete añadido con éxito");
        index();
    }

    public static void closeSession(){
        HomeView.index();
    }


}
