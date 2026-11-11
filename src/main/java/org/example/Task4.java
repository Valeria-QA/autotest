package org.example;

public class Task4 {

    public static String getGrade(int score) {
        String grade;

        if (score < 0) {
            grade = "Error";
        } else if (score <= 20) {
            grade = "E";
        } else if (score <= 40) {
            grade = "D";
        } else if (score <= 60) {
            grade = "C";
        } else if (score <= 80) {
            grade = "B";
        } else if (score <= 100) {
            grade = "A";
        } else {
            grade = "Error";
        }

        return grade;
    }

    public static void main(String[] args) {
        int score = 0;

        System.out.println(getGrade(score));
    }
}
