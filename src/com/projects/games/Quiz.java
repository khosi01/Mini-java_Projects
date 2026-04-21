package com.projects.games;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        //QUESTIONS array[]
        String[] questions = {"What is the capital city of France?",
                              "What is the largest organ in the human body?",
                              "What is the name of the world's longest river?",
                              "What is the largest technology company in South Korea?",
                              "What is the chemical symbol for gold?"};;
        //OPTIONS array[][]
        String[][] options = {{"1. Madrid ", "2. Paris", "3. Berlin", "4. Rome"},
                              {"1. Liver", "2. Torso", "3. Skin", "4. Brain"},
                              {"1. Nile", "2. Mississippi", "3. Zambezi", "4. Congo "},
                              {"1. Apple", "2. Huawei", "3. Phillips", "4. Samsung"},
                              {"1. Au", "2. Go", "3. Gd", "4. H2o"}};

        //DECLARE VARIABLES
        int[] answers = {2, 3, 1, 4, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        //WELCOME MESSAGE
        System.out.println("=======================================");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("=======================================\n");

        //QUESTION (loop)
        for(int i = 0; i <questions.length; i++){
            System.out.println(questions[i]);

            //   OPTIONS
            for(String option: options[i]){
                System.out.println(option);
            }

            //   GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //   CHECK OUR GUESS
            if(guess == answers[i]){
                System.out.println("================================================");
                System.out.println("Congratulations, you guessed the correct answer.");
                System.out.println("================================================");
                score++;
            } else {
                System.out.println("================================================");
                System.out.println("You guessed the incorrect answer.");
                System.out.println("================================================");
            }
        }
        // DISPLAY FINAL SCORE
        System.out.print("Your final score is " + score + " out of " + questions.length);

        scanner.close();
    }
}
