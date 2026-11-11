package org.example;

public class Task2 {

    public static String checkAccess(int age) {
        if (age > 18) {
            return "Allowed";
        } else {
            return "Denied";
        }
    }

    public static void main(String[] args) {
        int age = 18;

        System.out.println(checkAccess(age));
    }
}
