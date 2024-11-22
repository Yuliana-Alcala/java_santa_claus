package dev.javasantaclaus.singlentons;

import dev.javasantaclaus.repository.ToyRepository;

public class ToyRepositorySinglenton {
    private static final ToyRepository INSTANCE = new ToyRepository();

    private ToyRepositorySinglenton(){

    }

    public static ToyRepository getInstance(){
        return INSTANCE;
    }

}
