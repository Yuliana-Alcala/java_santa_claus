package repository;

import java.util.List;

import db.IDatabase;
import models.BadToy;
import models.GoodToy;
import singlentons.BadToyDatabaseSinglenton;
import singlentons.GoodToyDatabaseSinglenton;

@SuppressWarnings("rawtypes")
public class ToyRepository {

    private IDatabase db;

    public void setDB(String type) {
        if ("good_toy".equals(type)) {
            this.db = GoodToyDatabaseSinglenton.getInstance();

        } else if ("bad_toy".equals(type)) {
            this.db = BadToyDatabaseSinglenton.getInstance();
        }
    }

    @SuppressWarnings("unchecked")
    public void saveGoodToy(GoodToy toy) {

        List<GoodToy> toys = db.geToys();
        int nextId = toys.size() + 1;
        toy.setId(nextId);
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public void saveBadToy(BadToy toy) {

        List<BadToy> toys = db.geToys();
        int nextId = toys.size() + 1;
        toy.setId(nextId);
        db.save(toy);
    }

    public List<GoodToy> getGoodToys() {
        return GoodToyDatabaseSinglenton.getInstance().geToys();

    }

    public List<BadToy> getBadToys() {
        return BadToyDatabaseSinglenton.getInstance().geToys();

    }

    public void deleteGoodToy(String id) {

        List<GoodToy> goodToys = getGoodToys();
        /*
         * System.out.println("Contenido de la lista de GoodToys:");
         * for (int i = 0; i < goodToys.size(); i++) {
         * System.out.println(goodToys.get(i));
         * }
         */

        for (GoodToy toy : goodToys) {
            System.out.println("Comparando ID recibido: " + id + " con ID del juguete: " + toy.getId());

            if (toy.getId() == id) {
                System.out.println("¡Encontrado!");

                // db.delete(toy);
                // System.out.println("El juguete con ID " + id + " ha sido eliminado.");
                // return;
            } else {
                System.out.println("No encontrado");
            }
        }

    }

    @SuppressWarnings("unchecked")
    public void deleteBadToy(String id) {
        List<BadToy> toys = db.geToys();
        for (BadToy toy : toys) {
            if (toy.getId() == id)
                db.delete(toys);
        }
    }

}