package com.example.demo.entities;

public class Tavolo {
    private int numero;
    private int coperti;
    private StatoTavolo statoTavolo;


    public Tavolo(int numero, int coperti, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.coperti = coperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", coperti=" + coperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
