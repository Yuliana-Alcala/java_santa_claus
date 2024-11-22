package dev.javasantaclaus.db;

import java.util.List;

public interface IDatabase<E> {

    public void save(E entity);
    public void delete(E entity);
    List<E> geToys();

}
