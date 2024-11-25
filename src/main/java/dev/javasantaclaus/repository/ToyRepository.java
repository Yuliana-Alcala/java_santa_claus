package dev.javasantaclaus.repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import dev.javasantaclaus.db.IDatabase;
import dev.javasantaclaus.models.BadToy;
import dev.javasantaclaus.models.GoodToy;
import dev.javasantaclaus.singlentons.BadToyDatabaseSinglenton;
import dev.javasantaclaus.singlentons.GoodToyDatabaseSinglenton;

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



    public void saveCSV(){
        List<GoodToy> goodToys = getGoodToys();
        List<BadToy> badToys = getBadToys();
        String filePath = "/home/yua/CURSOS/BACKEND-BOOTCAMP/backend/java/projects/santaclaus/toys.csv"; // Cambia la ruta si es necesario
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Escribir encabezado para juguetes buenos
            writer.write("Tipo,Nombre,Marca,Edad Recomendada,Categoría\n");

            // Escribir juguetes buenos
            for (GoodToy goodToy : goodToys) {
                writer.write(String.format("Bueno,%s,%s,%d,%s\n",
                        goodToy.getTitle(),
                        goodToy.getBrand(),
                        goodToy.getAge(),
                        goodToy.getCategory()));
            }

            // Escribir encabezado para juguetes malos
            writer.write("Tipo,Nombre,Contenido\n");

            
            //Escribir juguetes malos
            for (BadToy badToy : badToys) {
                writer.write(String.format("Malo,%s,%s\n",
                        badToy.getTitle(),
                        badToy.getContent()));
            }

            System.out.println("Archivo CSV guardado correctamente en: " + filePath);

        } catch (IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
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