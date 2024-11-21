package repository;

import java.util.List;
import db.IDatabase;
import models.BadToy;
import models.GoodToy;
import db.GoodToyDatabase;
import db.BadToyDatabase;


@SuppressWarnings("rawtypes")
public class ToyRepository {

    private IDatabase db;

    public void setDB(String type) {
        // setter injection
        if (type == "good_toy")
            this.db = new GoodToyDatabase();

        if (type == "bad_toy")
            this.db = new BadToyDatabase();
    }

    @SuppressWarnings("unchecked")
    public void saveGoodToy(GoodToy toy) {
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public void saveBadToy(BadToy toy) {
        db.save(toy);
    }

    @SuppressWarnings("unchecked")
    public int getListGoodToy() {
        List<GoodToy> toys = db.geToys(); 
        return toys.size() + 1; 
    }

    @SuppressWarnings("unchecked")
    public int getListBadToy() {
        List<BadToy> toys = db.geToys(); 
        return toys.size() + 1; 
    }

}