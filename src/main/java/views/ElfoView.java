package views;

import java.util.Scanner;

public class ElfoView {
        private static final Scanner scanner = new Scanner(System.in);

    public static void index() {
        System.out.println("Sesión de Elfo: ");   
        System.out.println("1. Añadir juguetes");       
        System.out.println("2. Ver todos los juguetes");  
        System.out.println("3. Eliminar juguetes");       
        System.out.println("2. Cerra sesión"); 
        System.out.println("Seleccione una opción: ");  
        int option = scanner.nextInt();
 }}
