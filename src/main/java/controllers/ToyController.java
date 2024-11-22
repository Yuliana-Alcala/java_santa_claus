package controllers;

import dtos.BadToyDto;
import dtos.GoodToyDto;
import models.BadToy;
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
        repository.setDB("good_toy");
        
       // int id = repository.getListGoodToy();  
        //System.out.println("id es: " +id);      
        //toy.setId(id);        
        repository.saveGoodToy(toy);  
        System.out.println(toy);      
        ElfoView.addToyResponse();
        
    }

    public void postBadToy(BadToyDto badToyDto ) {
        BadToy toy = new BadToy(badToyDto.title(), badToyDto.content());
        repository.setDB("bad_toy");
        int id = repository.getListBadToy();
        toy.setId(id);
        
        repository.saveBadToy(toy);
        System.out.println(toy); 
        ElfoView.addToyResponse();
        
    }

   

}
