package dev.javasantaclaus;

import dev.javasantaclaus.controllers.HomeController;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        new HomeController();
    }
}
