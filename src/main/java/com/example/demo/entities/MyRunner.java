package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements CommandLineRunner {

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Autowired
    private Pizza Sasicc;
    private Drink Tavernello;


    @Override
    public void run(String... args) throws Exception {


        Tavolo tavolo1 = new Tavolo(1, 10, StatoTavolo.LIBERO);
        Order order1 = new Order(1,1,10,StatoOrdine.PRONTO, costoCoperto);

        order1.getListaDelMenu().add(Sasicc);
        order1.getListaDelMenu().add(Tavernello);
    }
}
