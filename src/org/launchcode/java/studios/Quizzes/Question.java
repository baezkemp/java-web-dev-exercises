package org.launchcode.java.studios.Quizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    protected String question;
    private ArrayList<String> answerOptions;
    private String correctAnswer;
    private String userAnswer;
    private int numberCorrect;
    Scanner input;

    public Question(String question, ArrayList<String> answerOptions, String correctAnswer) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getNumberCorrect() {
        return numberCorrect;
    }

    public void displayQuestionAndOptions(){
        input = new Scanner(System.in);
        System.out.println(question);
        System.out.println(answerOptions);
        this.userAnswer = input.nextLine();
    }

    public int isCorrect() {
        if ((userAnswer.toLowerCase()).equals(correctAnswer.toLowerCase())) {
            System.out.println("Correct!");
            this.numberCorrect ++;
        }
        else {
            System.out.println("Wrong!");
        } return numberCorrect;
    }
}
