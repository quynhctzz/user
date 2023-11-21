package com.example.user.model;

import org.springframework.stereotype.Component;

@Component
public class Pizza {
    private int id;

    private String namePizza;

    public Pizza(){

    }

    public Pizza(int id){
        this.id = id ;

    }

    public Pizza(String namePizza){
        this.namePizza = namePizza ;

    }
    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id = id;

    }
    public String getNamePizza(){
        return namePizza;
    }

    public void setNamePizza(String namePizza) {
        this.namePizza = namePizza;
    }
}
