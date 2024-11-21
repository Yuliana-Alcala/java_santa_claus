package repository;

import db.GoodToyDatabase;
import models.GoodToy;

public class ToyRepository {

    private final GoodToyDatabase db;

    public ToyRepository(){
        this.db = new GoodToyDatabase();
    }


    public void saveGoodToy(GoodToy toy){
        
        db.save(toy);

    }

}
