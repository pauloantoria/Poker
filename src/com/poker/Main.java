package com.poker;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.initPalos();
        deck.init();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();

    }
}
