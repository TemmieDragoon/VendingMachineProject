package com.miku.vending;

import com.miku.vending.modules.questions.questions.DrinkenQuestions;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        new DrinkenQuestions().askQuestion();



        /*
        //create the input scanner.
        Scanner scanner = new Scanner(System.in);

        //Asks user if he/she wants a drink
        System.out.println("Wil je iets drinken?");

        //String input is de Scanner.
        String input = scanner.nextLine();
        //Veranderd van antwoord door verschillende inputs
        switch (input.toUpperCase())
        {
            case "NEE":
                System.out.println("Dat vind ik wel erg jammer.");
                break;

            case "JA":
                System.out.println("Wat wil je te drinken?");
                input = scanner.nextLine();
                //toUpperCase registreert het woord met en zonder hoofdletters
                switch (input.toUpperCase())
                {
                    //case zorgt voor verschillende antwoorden door verschillende inputs
                    case "COLA":
                        System.out.println("Hier is uw cola.");
                        break;

                    case "7UP":
                        System.out.println("Hier is uw 7up.");
                        break;


                    case "SINAS":
                        System.out.println("Hier is uw sinas.");
                        break;

                    case "RED BULL":
                        System.out.println("Hier is uw red bull.");
                        break;

                       //default is het bericht wat je krijgt als je antwoord

                    default:
                        System.out.println("Deze keuze is niet beschikbaar");
                        break;
                }
                break;

            default:
                System.out.println("Antwoord onbekend.");

                break;
        }*/
    }
}