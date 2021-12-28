package ru.geekbrains.homework3;

import java.util.*;

public class HomeWorkApp {
    public static void main(String[] args) {
       work1();
       work2();

    }

    private static void work1(){
        Map<String, Integer> sos = new HashMap<>();
        String[] speech = {
                "Cat", "Potato", "Home",
                "Cheese", "sister", "Humster",
                "Dog", "Cat", "Java",
                "Home", "Window", "Coffee",
                "Dog", "Beta", "Humster",
                "Window", "Java", "Yava", "Sister"
        };

        for (int i = 0; i < speech.length; i++) {
            if (sos.containsKey(speech[i]))
                sos.put(speech[i], sos.get(speech[i]) + 1);
            else
                sos.put(speech[i], 1);
        }
        System.out.println(sos);
    }
    private static void work2() {

        Directory directory = new Directory();

        directory.add("Iwanow", "8999876321");
        directory.add("Tulisow", "8912321426");
        directory.add("Bezrukowa", "8917155552");
        directory.add("Redka", "8913455672");
        directory.add("Kolomecewa", "898402799");
        directory.add("Dubina", "899145111");
        directory.add("Redka", "89923231999");
        directory.add("Naimushina", "8888783113");
        directory.add("Iwanow", "832454234");

        System.out.println(directory.get("Iwanow"));
        System.out.println(directory.get("Redka"));
        System.out.println(directory.get("Naimushina"));
        System.out.println(directory.get("Dubina"));
    }
    static class Directory {
        private Map<String, List<String>> people = new HashMap<>();
        private List<String> number;

        public void add(String surname, String phone_number) {
            if (people.containsKey(surname)) {
                number =people .get(surname);
                number.add(phone_number);
                people.put(surname,number );
            } else {
                number = new ArrayList<>();
                number.add(phone_number);
                people.put(surname, number);
            }
        }

        public List<String> get(String surname) {
            return people.get(surname);
        }
    }
}
