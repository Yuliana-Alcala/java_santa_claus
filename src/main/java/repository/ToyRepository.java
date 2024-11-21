package repository;

import java.util.List;

import db.GoodToyDatabase;
import models.GoodToy;

public class ToyRepository {

    private final GoodToyDatabase db;

    public ToyRepository(){
        this.db = new GoodToyDatabase();
    }

    public int GetListGoodToy(){
        List<GoodToy> toys = db.geToys();
        int newId = toys.size() + 1;
        return newId;
    }

    public void saveGoodToy(GoodToy toy){        
        db.save(toy);
    }

}
