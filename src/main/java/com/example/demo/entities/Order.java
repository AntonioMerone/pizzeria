package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//uso Lombok con getter setter e to string facendo @getter, @setter, @tostring
@Getter
@Setter
@ToString


public class Order {
    private int numeriOrdine;
    private List<Menu> listaDelMenu = new ArrayList<>();
    private Tavolo tavolo;
    private int numeriCoperti;
    private LocalDateTime oraOrdine;
    private StatoOrdine statoOrdine;
    private double coperto;


    public Order(int numeriOrdine, Tavolo tavolo, int numeriCoperti, StatoOrdine statoOrdine, double coperto) {
        this.numeriOrdine = numeriOrdine;
        this.tavolo = tavolo;
        this.numeriCoperti = numeriCoperti;
        this.statoOrdine = statoOrdine;
        this.coperto = coperto;
    }

    public double costoTotale() {
        double prezzoTotale = listaDelMenu.stream()
                .mapToDouble(elemento -> elemento.getPrice()).sum();
        return prezzoTotale + (coperto * numeriCoperti);
    }

}
