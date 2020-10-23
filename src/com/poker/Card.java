package com.poker;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private String palo;
    private String valor;
    private String color;


    Card (String palo, String valor, String color) {
        this.palo = palo;
        this.valor = valor;
        this.color = color;
    }

    Card(String palo, String color, int i){
        this.palo = palo;
        this.color = color;
    }

    public String getPalo() {
        return palo;
    }
    public void setPalo (String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }

    public String getValor() {
        return valor;
    }
    public void setValor (Integer valor) {
        if (valor <= 10) {
            if (valor == 1)
                this.valor = "A";
            this.valor = valor.toString();
        }
        else {
            if(valor == 11)
                this.valor = "J";
            else if (valor == 12)
                this.valor = "Q";
            else
                this.valor = "K";
        }
    }

    @Override
    public String toString() {
        String mensaje = "%s, %s, %s";
        return String.format(mensaje,palo,color,valor);
    }
}
