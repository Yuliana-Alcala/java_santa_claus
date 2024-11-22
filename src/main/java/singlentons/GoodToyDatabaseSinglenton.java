package singlentons;

import db.GoodToyDatabase;

public class GoodToyDatabaseSinglenton {

    private static GoodToyDatabase INSTANCE;

    private GoodToyDatabaseSinglenton(){}

    public static GoodToyDatabase getInstance(){
        if(INSTANCE == null) 
            INSTANCE = new GoodToyDatabase();
        return INSTANCE;

    }

}
