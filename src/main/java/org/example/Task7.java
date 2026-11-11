package org.example;

public class Task7 {
    public static boolean hasBug(String[] messages) {
        boolean result = false;

        for (int i = 0; i < messages.length; i++) {
            String word = messages[i];

            if (word.equalsIgnoreCase("Bug")) {
                result = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] messages = {"Ok", "Warning", "Bug", "Error"};

        System.out.println(hasBug(messages));
    }
}
