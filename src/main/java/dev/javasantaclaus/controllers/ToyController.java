package dev.javasantaclaus.controllers;

import java.util.List;

import dev.javasantaclaus.dtos.BadToyDto;
import dev.javasantaclaus.dtos.GoodToyDto;
import dev.javasantaclaus.models.BadToy;
import dev.javasantaclaus.models.GoodToy;
import dev.javasantaclaus.repository.ToyRepository;
import dev.javasantaclaus.singlentons.ToyRepositorySinglenton;
import dev.javasantaclaus.views.ElfoView;

public class ToyController {

    private final ToyRepository repository;

    public ToyController(){
        this.repository = ToyRepositorySinglenton.getInstance();
    }

    public void postGoodToy(GoodToyDto goodToyDto) {
        GoodToy toy = new GoodToy(goodToyDto.title(), goodToyDto.brand(), goodToyDto.recommendedAge(),goodToyDto.category());
        repository.setDB("good_toy");               
        repository.saveGoodToy(toy);  
              
        ElfoView.addToyResponse();
        
    }

    public void postBadToy(BadToyDto badToyDto ) {
        BadToy toy = new BadToy(badToyDto.title(), badToyDto.content());
        repository.setDB("bad_toy");        
        repository.saveBadToy(toy);
   
        ElfoView.addToyResponse();
        
    }

    public List<GoodToy> getGoodToys(){
        repository.setDB("good_toy");   
        
        List<GoodToy> goodToys = repository.getGoodToys();
        for(GoodToy goodToy: goodToys){
            System.out.println(goodToy.getTitle());
        }
        return repository.getGoodToys();
    }

    public List<BadToy> getBadToys(){
        repository.setDB("bad_toy");   
        
        List<BadToy> badToys = repository.getBadToys();
        for(BadToy badToy: badToys){
            System.out.println(badToy.getTitle());
        }
        return repository.getBadToys();
    }

    public void getAllToys() {
        
        List<GoodToy> goodToys = repository.getGoodToys();
        List<BadToy> badToys = repository.getBadToys();
        
        ElfoView.displayToys(goodToys, badToys);
    }
   
    public void deleteGoodToy(String id) {
        
        //repository.setDB("good_toy");
        repository.deleteGoodToy(id);
            
    }

    public void deleteBadToy(String id) {
        repository.setDB("bad_toy");
        repository.deleteBadToy(id);
        
    }
   

}
