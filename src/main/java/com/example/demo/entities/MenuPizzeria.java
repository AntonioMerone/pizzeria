package com.example.demo.entities;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class MenuPizzeria {
    private List<Pizza> pizzalist;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
//liste di array di pizze, drink e topping che passo nel costruttore
//costruttore
    public MenuPizzeria(List<Pizza> pizzalist, List<Drink> drinkList, List<Topping> toppingList) {
        this.pizzalist = pizzalist;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }

    public void StampaMenu(){
        System.out.println("Menu pizzeria da Totore");
        System.out.println("Lista pizze: ");
        pizzalist.forEach( pizza -> System.out.println(pizza));

        System.out.println("Lista Drinks ");
        drinkList.forEach(drink -> System.out.println(drink));

        System.out.println("lista Topping ");
        toppingList.forEach(topping -> System.out.println(topping));
    }

    }


