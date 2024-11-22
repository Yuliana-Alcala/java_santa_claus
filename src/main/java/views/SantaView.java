package views;

import java.util.List;

import controllers.ToyController;
import models.BadToy;
import models.GoodToy;

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
                        System.out.println("Seleccione una opción: ");
                        int option = scanner.nextInt();

                        switch (option) {
                                case 1:
                                        System.out.println("2. lista niños buenos");
                                        showGodToys();
                                        break;
                                case 2:
                                        System.out.println("2. lista niños malos");
                                        break;
                                case 3:

                                        System.out.println("3. Guardar lista de todos los juguetes (.csv)s");
                                        break;
                                case 4:
                                        System.out.println("********** Sesión Santa cerrada *************");
                                        programRuning = false;
                                        closeSession();
                                        break;

                                default:
                                        System.out.println("La opción: " + option + " es incorrecta");
                                        break;
                        }
                }

        }

        public static void showGodToys() {

                controller.getGoodToys();

        }

        public static void displayToys(List<GoodToy> goodToys) {

                System.out.println("Juguetes Buenos:");
                for (GoodToy toy : goodToys) {
                        System.out.println(toy);
                }

        }

        public static void closeSession() {
                HomeView.index();
        }

}
