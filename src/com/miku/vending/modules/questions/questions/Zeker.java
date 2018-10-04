package com.miku.vending.modules.questions.questions;

import com.miku.vending.modules.questions.framework.Question;

import java.util.Arrays;
import java.util.Set;

public class Zeker extends Question {

    public Zeker() {
        super("Weet u het zeker");

        finalAwnsers.put("ja", "Ik wens u een fijne dag");
        finalAwnsers.put("nee", null);

    }

    @Override
    public void awnserQuestion(String userAwnser) {

        String systemAwnser = null;
        for (String mogelijkeAntwoorden : finalAwnsers.keySet()) {
            if (mogelijkeAntwoorden.equalsIgnoreCase(userAwnser)) {
                systemAwnser = userAwnser;
                break;
            }
        }

        if (systemAwnser == null) {
            System.out.println("Dit is geen correct antwoord!");
            System.out.println("Type: " + Arrays.toString(new Set[]{this.finalAwnsers.keySet()}));

            askQuestion();

            return;
        }

        systemAwnser  = this.finalAwnsers.get(systemAwnser);

        if (systemAwnser == null) {
            new DrinkenQuestions().askQuestion();

            return;
        }

        System.out.println(systemAwnser);

    }
}

