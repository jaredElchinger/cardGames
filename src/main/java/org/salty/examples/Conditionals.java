package org.salty.examples;

import java.util.Arrays;
import java.util.List;

public class Conditionals {

    public void ifStatement() {

        List<String> names = Arrays.asList("Gunner", "Jared", "Thomas");

        names.forEach(name -> {

            if (name.equals("Gunner")) {
                System.out.println("Gunner is cool.");
            } else if (name.equals("Jared")) {
                System.out.println("Jared is awesome.");
            } else if (name.equals("Thomas")) {
                System.out.println("Thomas sucks.");
            } else {
                System.out.println("Who are you?");
            }

        });
    }

}
