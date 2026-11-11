package org.example;

public class Task5 {

    public static String blastOff(int start) {
        String result = "";

        for (int i = start; i >= 1; i--) {
            result = result + i + " ";
        }

        result = result + "Поехали!";

        return result;
    }

    public static void main(String[] args) {
        int start = 5;

        System.out.println(blastOff(start));
    }
}
