package com.company.studios.studio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {
    private ArrayList<String> answers;
    private ArrayList<String> possibleAnswers;

    public Checkbox(String textQuestion, ArrayList<String> answers, ArrayList<String> possibleAnswers) {
        super(textQuestion);
        this.answers = answers;
        this.possibleAnswers = possibleAnswers;
    }


    @Override
    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index of the correct answers: (press enter on blank line to exit)");
        ArrayList<String> userAnswers = new ArrayList<>();

        for (int i = 0; i < this.possibleAnswers.size(); i++) {
            System.out.println(i + ": " + this.possibleAnswers.get(i));
        }
        boolean hasMoreAnswers = true;

        while (hasMoreAnswers) {
            String oneNum = input.nextLine();
            if (oneNum.equals("")) {
                hasMoreAnswers = false;
            } else {
                int indexNum = Integer.parseInt(oneNum);
                if (!userAnswers.contains(possibleAnswers.get(indexNum))) {
                    userAnswers.add(possibleAnswers.get(indexNum));
                }
            }

        }
        if (userAnswers.size() != this.answers.size()) {
            System.out.println("Incorrect!");
            return false;
        } else {
            int correctAnswerNum = 0;
            for (String oneAnswer : userAnswers) {
                if (answers.contains(oneAnswer)) {
                    correctAnswerNum++;
                }
            }
            if (correctAnswerNum == this.answers.size()) {
                System.out.println("Correct!");
                return true;
            }
        }

        System.out.println("Incorrect!");
        return false;
    }

    @Override
    public void displayAnswer() {
        String result = "";
        for (String answer : this.answers) {
            if (result.length() == 0) {
                result = "The correct answers are : " + answer;
            } else {
                result = result + ", " + answer;
            }

        }
        System.out.println(result);
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
