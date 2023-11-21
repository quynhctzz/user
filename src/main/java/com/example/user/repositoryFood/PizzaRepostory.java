package com.example.user.repositoryFood;

import com.example.user.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PizzaRepostory {

    @Autowired
    private Pizza pizza;

    public String getPizza(){
        return pizza.getNamePizza ();

    }


}
