package dev.javasantaclaus.singlentons;

import dev.javasantaclaus.db.BadToyDatabase;


public class BadToyDatabaseSinglenton {

    private static BadToyDatabase INSTANCE;

    private BadToyDatabaseSinglenton(){}

     public static BadToyDatabase getInstance() {
        if(INSTANCE == null) 
            INSTANCE = new BadToyDatabase();
        return INSTANCE;
        
    }


}
