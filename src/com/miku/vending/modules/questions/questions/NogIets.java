package com.miku.vending.modules.questions.questions;

import com.miku.vending.modules.questions.framework.Question;

import java.util.Arrays;
import java.util.Set;

public class NogIets extends Question {

    public NogIets() {
        super("Wilt u nog iets te drinken?");

        nogFinal.put("ja", new KindOfDrink());
        nogFinal.put("nee", new Zeker());
    }

    @Override
    public void awnserQuestion(String userAwnser) {

            String systemAwnser = null;
            for (String mogelijkeAntwoorden : nogFinal.keySet()) {
                if (mogelijkeAntwoorden.equalsIgnoreCase(userAwnser)) {
                    systemAwnser = userAwnser;
                    break;
                }
            }

            if (systemAwnser == null) {
                System.out.println("Dit is geen correct antwoord!");
                System.out.println("Type: " + Arrays.toString(new Set[]{this.nogFinal.keySet()}));

                askQuestion();

                return;
            }


                    //Me commits werken niet 100%
        this.nogFinal.get(systemAwnser).askQuestion();

        }
    }

