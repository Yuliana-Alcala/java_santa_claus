package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.GoodToy;

public class GoodToyDatabase {

 
    private List<GoodToy> goodToys;

    public GoodToyDatabase(){
        initDB();
    }

    public List<GoodToy> geToys(){
        return goodToys;
    }

    public void save(GoodToy toy){  
              
        goodToys.add(toy);
        
        
    }

    private void initDB() {
        this.goodToys = new ArrayList<>(Arrays.asList(new GoodToy("juguete primero", "lego", 10, "construccion")));
        
    }

}
