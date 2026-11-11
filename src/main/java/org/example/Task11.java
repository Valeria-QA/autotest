package org.example;

import java.util.List;
import java.util.ArrayList;

public class Task11 {

    public static int calcAverage(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum = sum + number;
        }

        int average = sum / list.size();

        return average;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);

        System.out.println(calcAverage(list));
    }
}
