package singlentons;

import repository.ToyRepository;

public class ToyRepositorySinglenton {
    private static final ToyRepository INSTANCE = new ToyRepository();

    private ToyRepositorySinglenton(){

    }

    public static ToyRepository getInstance(){
        return INSTANCE;
    }

}
