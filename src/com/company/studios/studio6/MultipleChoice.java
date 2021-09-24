package com.company.studios.studio6;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice  extends Question{
    private String answer;
    private ArrayList<String> possibleAnswers;

    public MultipleChoice(String answer, ArrayList<String> possibleAnswers, String textQuestion) {
        super(textQuestion);
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
    }


    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for the answer: ");
        for(int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println( i + ". " + possibleAnswers.get(i));
        }
        int userAnswer = input.nextInt();

        if(possibleAnswers.get(userAnswer).equals(answer)) {
            System.out.println("Correct");
            return true;
        }
        System.out.println("Incorrect");
        return false;
    }

    @Override
    public void displayAnswer() {
        System.out.println("The correct answer is " + this.answer);
    }
}
