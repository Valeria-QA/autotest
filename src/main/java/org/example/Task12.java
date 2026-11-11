package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task12 {

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);

            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Ivan");
        list.add("Olga");
        list.add("Ivan");

        String nameToRemove = "Ivan";

        List<String> newList = removeSpecificName(list, nameToRemove);

        System.out.println(newList);
    }
}
