package db;

import java.util.List;

public interface IDatabase<E> {

    public void save(E entity);
    List<E> geToys();

}
