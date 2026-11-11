package org.example;

public class Task9 {

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];

            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -2, -15, -4};

        System.out.println(findMax(arr));
    }
}
