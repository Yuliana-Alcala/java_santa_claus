package views;

import java.util.Scanner;

public class HomeView {
       
       private static final Scanner scanner = new Scanner(System.in);

       public static void index() {
              System.out.println("Iniciar sesión de trabajo como: ");   
              System.out.println("1. Elfo");       
              System.out.println("2. Santa");  
              System.out.println("Seleccione una opción: ");  
              int option = scanner.nextInt();

              if(option == 1)
                     ElfoView.index();
              
              
       }

       
      

}