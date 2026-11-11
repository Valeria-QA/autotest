package org.example;

public class Task10 {

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int newIndex = arr.length - 1 - i;
            result[newIndex] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Zero"};

        String[] reversed = reverse(arr);

        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
    }
}
