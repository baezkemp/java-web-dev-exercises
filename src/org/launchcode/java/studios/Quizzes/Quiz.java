package org.launchcode.java.studios.Quizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    private ArrayList<Question> myQuiz;
    int grade = 0;

    public Quiz() {}

    public void QuizBuilder () {
        ArrayList<String> answerOptions = new ArrayList<>(Arrays.asList("True", "False"));
        ArrayList<String> answerOptions2 = new ArrayList<>(Arrays.asList("Cat", "Dog", "Bird"));
        ArrayList<String> answerOptions3 = new ArrayList<>(Arrays.asList("Cat", "Dog", "Bird"));

        this.myQuiz = new ArrayList<>();
        myQuiz.add(new TrueOrFalse("Is the sky pink?", answerOptions,"True"));
        myQuiz.add(new MultipleChoice("Which animal can fly?", answerOptions2, "Bird"));
        myQuiz.add(new CheckBox("Which animal(s) has(have) four legs?", answerOptions3, "Cat, Dog"));

        for (int i = 0; i < myQuiz.size(); i++) {
            myQuiz.get(i).displayQuestionAndOptions();
            if (myQuiz.get(i).isCorrect() == 1) {
                grade++;
            }
        }
        System.out.println("Correct: " + grade + " out of " + myQuiz.size());
    }
}

