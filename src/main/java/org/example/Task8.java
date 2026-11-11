package org.example;

public class Task8 {

    public static String getEvenInRange(int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (result.equals("")) {
                    result = "" + i;
                } else {
                    result = result + " " + i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int start = 12;
        int end = 5;

        System.out.println(getEvenInRange(start, end));
    }
}
