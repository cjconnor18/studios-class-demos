package com.company.studios.studio6;

import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> questions;
    int score;

    public Quiz(ArrayList<Question> questions, int score) {
        this.questions = questions;
        this.score = score;
    }

    public Quiz() {
        this(new ArrayList<Question>(), 0);
    }

    public void addQuestion(Question newQuestion) {
        this.questions.add(newQuestion);
    }

    public void runQuiz() {
        for(Question question : this.questions) {
            question.displayQuestion();
            Boolean isCorrect = question.checkAnswer();
            question.displayAnswer();
            System.out.println("");
            if(isCorrect) {
                score++;
            }
        }

        this.displayScore();
    }

    private void displayScore() {
        System.out.println("Your score is " + this.score + " out of " + this.questions.size());
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
