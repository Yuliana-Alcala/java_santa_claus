package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.BadToy;


public class BadToyDatabase implements IDatabase<BadToy> {

    private List<BadToy> badToys;
     public BadToyDatabase(){
        initDB();
    }

    public List<BadToy> geToys(){
        return badToys;
    }

    public void save(BadToy toy){  
              
        badToys.add(toy);
        
        
    }

    private void initDB() {
        this.badToys = new ArrayList<>(Arrays.asList(new BadToy("juguete primero", "lego")));
        
    }

}
