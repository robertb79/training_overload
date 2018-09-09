package com.robertbuican;

import javax.swing.text.PlainDocument;

public class Main {

    public static void main(String[] args) {

        double feet = 30.4;
        double inches = 2.54;
        double newInch = inches/feet;
        System.out.println("A feet comprise " + feet + " centimeters.");
        System.out.println("An inch comprise " + inches + " centimeters.");
        System.out.println("An inch is equal " + newInch + " feets");
    }

//    public static void main(String[] args) {
//        int newScore = calculateScore("Robert", 200);
////        System.out.println("The new score is " + newScore);
//
//        calculateScore(70);
//
//        calculateScore();
//    }
//
//    private static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    private static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points.");
//        return score * 1000;
//    }
//
//    private static int calculateScore() {
//        System.out.println("No player name and no score calculated.");
//        return 0;
//    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
        }
        return -1;
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
        }
        return -1;
    }
}
