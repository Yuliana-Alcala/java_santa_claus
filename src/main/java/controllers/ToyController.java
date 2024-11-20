package controllers;

import dtos.GoodToyDto;
import repository.ToyRepository;
import views.ElfoView;

public class ToyController {

    private final ToyRepository repository;

    public ToyController (ToyRepository repository){
        this.repository = repository;
    }

    public static void postGoodToy(GoodToyDto goodToyDto) {
        //hará algo con el repo y si todo a ido bien
        //devolverá la respuesta
        ElfoView.addToyResponse();
        
    }

}
