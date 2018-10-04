package com.miku.vending.modules.questions.questions;

import com.miku.vending.modules.questions.framework.Question;

import java.util.*;

public class DrinkenQuestions extends Question {

    public DrinkenQuestions() {
        super("Wilt u wat te drinken?");

        antwoorden.put("ja", new KindOfDrink());
        antwoorden.put("nee", new Zeker());
    }

    @Override
    public void awnserQuestion(String userAwnser) {

        String systemAwnser = null;
        for (String mogelijkeAntwoorden : antwoorden.keySet()) {
            if (mogelijkeAntwoorden.equalsIgnoreCase(userAwnser)) {
                systemAwnser = userAwnser;
                break;
            }
        }

        if (systemAwnser == null) {
            System.out.println("Dit is geen correct antwoord!");
            System.out.println("Type: " + Arrays.toString(new Set[]{this.antwoorden.keySet()}));

            askQuestion();

            return;
        }

        this.antwoorden.get(systemAwnser).askQuestion();
    }
}
