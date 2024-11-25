package dev.javasantaclaus.views;

import java.util.List;

import dev.javasantaclaus.controllers.ToyController;
import dev.javasantaclaus.models.BadToy;
import dev.javasantaclaus.models.GoodToy;

public class SantaView extends View {
        private static final ToyController controller = new ToyController();

        public static void index() {
                boolean programRuning = true;
                while (programRuning) {
                        System.out.println("-------------------------");
                        System.out.println("Gestor de juguetes (Tipo de sesión: Santa)");
                        System.out.println("1. Ver lista de juguetes niños buenos");
                        System.out.println("2. Ver lista de juguetes niños malos");
                        System.out.println("3. Guardar lista de todos los juguetes (.csv)");
                        System.out.println("4. Cerrar sesión");
                        System.out.print("Seleccione una opción: ");
                        int option = scanner.nextInt();

                        switch (option) {
                                case 1:
                                        
                                        showGoodToys();
                                        break;
                                case 2:
                                        showBadToys();
                                        break;
                                case 3:

                                        saveAllToyCSV();
                                        break;
                                case 4:
                                        
                                        programRuning = false;
                                        closeSession();
                                        break;

                                default:
                                        System.out.println("La opción: " + option + " es incorrecta");
                                        break;
                        }
                }

        }

        public static void showGoodToys() {

                List<GoodToy> goodToys = controller.getGoodToys();
                System.out.println("*********************************");
                System.out.println("Listado de juguetes niños buenos:");
                for (GoodToy toy : goodToys) {
                        System.out.println(toy);
                }

        }

        public static void showBadToys() {

                List<BadToy> badToys = controller.getBadToys();
                System.out.println("*********************************");
                System.out.println("Listado de juguetes niños malos:");
                for (BadToy toy : badToys) {
                        System.out.println(toy);
                }

        }

        
        
        public static void saveAllToyCSV(){
                System.out.println("Guardando en CSV");
               
                controller.saveCSV();
        }

        public static void closeSession() {
                System.out.println("*********************************************");
                System.out.println("********** Sesión Santa cerrada *************");
                System.out.println("*********************************************");
                HomeView.index();
        }

}
