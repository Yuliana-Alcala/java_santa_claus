package dev.javasantaclaus.controllers;

import dev.javasantaclaus.views.HomeView;

public class HomeController {


    public HomeController(){
        index();
    }
    
    public void index() {
       HomeView.index();        
    }

}
