package org.example;

public class Task3 {

    public static boolean isPositive(int n) {
        boolean result = (n >= 0) ? true : false;

        return result;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(isPositive(n));
    }
}
