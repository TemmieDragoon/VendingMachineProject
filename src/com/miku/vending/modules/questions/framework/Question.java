package com.miku.vending.modules.questions.framework;

import com.miku.vending.modules.questions.questions.KindOfDrink;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Question {

    public Question(String systemQuestion) {
        this.question= systemQuestion;

        antwoorden = new HashMap();
        finalAwnsers = new HashMap<>();
        zeker = new HashMap<>();
        nogIets = new HashMap<>();
        nogFinal = new HashMap<>();
    }

    public String question;
    public HashMap<String, Question> antwoorden;
    public HashMap<String, String> finalAwnsers;
    public HashMap<String, String> zeker;
    public HashMap<String, String> nogIets;
    public HashMap<String, Question> nogFinal;


    public void askQuestion() {
        System.out.println(this.question);

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        this.awnserQuestion(input);
    }



    public abstract void awnserQuestion(String antwoord);
}
