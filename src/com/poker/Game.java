package com.poker;

import java.util.Scanner;

public class Game {

    private final Poker poker;
    private int juegosHechos;
    private boolean isPlaying;

    Game() {
        poker = new Poker();
    }

    public void showMenu() {
        if (juegosHechos == 1)
            System.out.println("¡Bienvenido a tu póker favorito estilo Las Vegas 2.0!");

        System.out.println("Selecciona una opción: \n");
        System.out.println("(1) Revolver deck.");
        System.out.println("(2) Sacar una carta.");
        System.out.println("(3) Saca una carta al azar.");
        System.out.println("(4) Crear una mano de 5 cartas.");
        System.out.println("(5) Reiniciar el juego.");
        System.out.println("(0) Salir.");
    }

    private static void showDivision(){
        System.out.println("-------------------------------");

    }
    private void evaluateOp(int op) throws Exception {
        switch (op){
            case 1:
                poker.shuffle();
                juegosHechos++;
                break;
            case 2:
                poker.head();
                juegosHechos++;
                break;
            case 3:
                poker.pick();
                juegosHechos++;
                break;
            case 4:
                poker.hand();
                juegosHechos++;
                break;
            case 5:
                poker.reset();
                juegosHechos = 1;
                break;
            default:
                isPlaying = false;
                break;
        }
    }

    public void play() {
        isPlaying = true;
        juegosHechos = 1;

        do {
            showMenu();
            try {
                var op = inputOption();

                if (op != 0)
                    showDivision();

                evaluateOp(op);

                if (op != 0)
                    showDivision();
            }

            catch (Exception excepcion) {
                System.out.println (excepcion.getMessage());
                showDivision();
            }
        }
        while (isPlaying);
    }

        private int inputOption() throws Exception {
            Scanner scn = new Scanner (System.in);
            var op = scn.nextInt();
            if  (op <0 || op >5 )
                throw new Exception ("No te chifles, selecciona una opción válida:");

            return op;
        }
}
