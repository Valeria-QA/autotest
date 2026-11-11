package org.example;

public class Task6 {

    public static int sumToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumToN(n));
    }
}
