package com.company.studios.studio6;

public abstract class Question {
    private String textQuestion;

    public Question(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public void displayQuestion() {
        System.out.println(this.textQuestion);
    }

    public abstract boolean checkAnswer();

    public abstract void displayAnswer();





    // getters and setters
    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }
}
