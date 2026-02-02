package com.example.demo.Config;


import com.example.demo.entities.Drink;
import com.example.demo.entities.MenuPizzeria;
import com.example.demo.entities.Pizza;
import com.example.demo.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {
    @Bean
    public Topping Ham(){
        return new Topping("Ham", 0.99, 100);
    }

    @Bean
    public Topping Pineapple(){
        return new Topping("Pineapple", 0.50, 10);
    }

    @Bean
    public Topping Cheese() {
        return new Topping("cheese", 1, 200);

    }

    @Bean
    public Topping Onion(){
        return new Topping("onion", 1,50);
    }

    @Bean
    public Topping Salami(){
        return new Topping("Salami", 2,100);
    }
    //drink

    @Bean
    public Drink CocaCola(){
        return new Drink("CocaCola", 2, 250);

    }
    @Bean
    public Drink Tavernello(){
        return new Drink("Tavernello", 5,300);
    }
    @Bean
    public Drink LimoncelloDiZioLello(){
        return new Drink("Limoncello di Zio Lello", 20, 1000);
    }

//pizze

    @Bean
    public Pizza Margherita(){
        Pizza p = new Pizza ("Margherita", 5, 1200);
        p.addTopping(Cheese());
        p.addTopping(Ham());


        return p; //ritorno la nuova pizza creata
    }
@Bean
    public Pizza Sasicc(){
        Pizza p2 = new Pizza ("Sasiccia special", 8, 1500);
        p2.addTopping(Cheese());
        p2.addTopping(Ham());
        p2.addTopping(Salami());
        p2.addTopping(Onion());

        return p2;
}
    @Bean
    public Pizza Famocc(){
        Pizza p3 = new Pizza ("ricchiona", 28, 1100);
        p3.addTopping(Cheese());
        p3.addTopping(Salami());
        p3.addTopping(Pineapple());

        return p3;

    }
    @Bean
    public MenuPizzeria menuPizzeria(){
        List<Pizza> pizze = List.of(Margherita(),Famocc(),Sasicc());
        List<Drink> drinks = List.of(CocaCola(), LimoncelloDiZioLello(), Tavernello());
        List<Topping> toppings = List.of(Onion(), Cheese(), Ham(), Pineapple());

        return new MenuPizzeria(pizze, drinks, toppings);


}}
