package views;


public class HomeView extends View{


       public static void index() {

              boolean programRuning = true;
              while(programRuning){
                     System.out.println("--------------------------------"); 
                     System.out.println("Iniciar sesión de trabajo como: ");   
                     System.out.println("1. Elfo");       
                     System.out.println("2. Santa");  
                     System.out.println("3. Salir"); 
                     System.out.println("Seleccione una opción: ");  
                     int option = scanner.nextInt();

                     
                     switch (option) {
                            case 1:
                                   ElfoView.index();
                                   break;
                            case 2:
                                   System.out.println("2. Santa"); 
                                   break;
                            case 3:
                                   System.out.println("********** Feliz Navidad **********");
                                   exitProgram();
                                   break;
                            default:
                                   System.out.println("La opción: "+ option + " es incorrecta");
                                   break;
                     }
              }
           
              
       }

       public static void exitProgram(){
              scanner.close();
              System.exit(0);
       }
      

}
