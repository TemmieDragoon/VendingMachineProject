package com.miku.vending.modules.questions.questions;

import com.miku.vending.modules.questions.framework.Question;

import java.util.Arrays;
import java.util.Set;

public class KindOfDrink extends Question {


    public KindOfDrink () {
        super("wat wilt u te drinken?" );

        finalAwnsers.put("cola", "Hier is uw Cola!");
        finalAwnsers.put("fanta", "Hier is uw Fanta!");
        finalAwnsers.put("7up", "Hier is uw 7up!");
        finalAwnsers.put("sprite", "Hier is uw Sprite!");
        finalAwnsers.put("melk", "Hier is uw Melk!");
        finalAwnsers.put("water", "Hier is uw Water!");

    }

    @Override
    public void awnserQuestion(String antwoord) {

        String awnser = null;
        for (String mogelijkeAntwoorden : finalAwnsers.keySet()) {
            if (mogelijkeAntwoorden.equalsIgnoreCase(antwoord)) {
                awnser = antwoord;
                break;
            }
        }

        if (awnser == null) {
            System.out.println("Dit is geen correct antwoord!");
            System.out.println("Type: " + Arrays.toString(new Set[]{this.finalAwnsers.keySet()}));

            askQuestion();

            return;
        }

        System.out.println(this.finalAwnsers.get(awnser));

        new NogIets().askQuestion();

    }
}

