package controllers;

import views.HomeView;

public class HomeController {


    public HomeController(){
        index();
    }
    
    public void index() {
       HomeView.index();        
    }

}
