package com.company.studios.studio6;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        TrueOrFalse question1 = new TrueOrFalse("t", "A circle is round-ish.");

        ArrayList<String> q2PossibleAnswers = new ArrayList<>();
        q2PossibleAnswers.add("Wildcat");
        q2PossibleAnswers.add("Jayhawk");
        q2PossibleAnswers.add("Lion");
        q2PossibleAnswers.add("Bear");

        MultipleChoice question2 = new MultipleChoice("Jayhawk", q2PossibleAnswers, "What is KU's mascot?");

        ArrayList<String> q3PossibleAnswers = new ArrayList<>();
        q3PossibleAnswers.add("Lynx");
        q3PossibleAnswers.add("Storm");
        q3PossibleAnswers.add("Lakers");
        q3PossibleAnswers.add("Sky");
        q3PossibleAnswers.add("Jayhawks");

        ArrayList<String> q3Answers = new ArrayList<>();
        q3Answers.add("Lynx");
        q3Answers.add("Storm");
        q3Answers.add("Sky");

        Checkbox question3 = new Checkbox("Which of the following are WNBA teams?", q3Answers,q3PossibleAnswers);

        Quiz newQuiz = new Quiz();
        newQuiz.addQuestion(question1);
        newQuiz.addQuestion(question2);
        newQuiz.addQuestion(question3);

        newQuiz.runQuiz();



    }
}
