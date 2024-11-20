package views;

public class ElfoView extends View {

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
                    System.out.println("1. Añadir juguetes"); 
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

    public static void closeSession(){
        HomeView.index();
    }


}
