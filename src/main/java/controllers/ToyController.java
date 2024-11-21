package controllers;

import dtos.GoodToyDto;
import models.GoodToy;
import repository.ToyRepository;
import singlentons.ToyRepositorySinglenton;
import views.ElfoView;

public class ToyController {

    private final ToyRepository repository;

    public ToyController(){
        this.repository = ToyRepositorySinglenton.getInstance();
    }

    public void postGoodToy(GoodToyDto goodToyDto) {
        GoodToy toy = new GoodToy(goodToyDto.title(), goodToyDto.brand(), goodToyDto.recommendedAge(),goodToyDto.category());
        repository.saveGoodToy();
        ElfoView.addToyResponse();
        
    }

}
