package org.example;

public class Task1 {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println(isEven(n));
    }
}
