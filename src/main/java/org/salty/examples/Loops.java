package org.salty.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

    public void whileLoopExample() {

        System.out.println("While Loops are good for looping until a condition is met.");

        List<String> names = new ArrayList<>();
        names.add("Thomas");
        names.add("Gunner");
        names.add("Jared");

        //'!' negates a boolean, so if true it makes false and if false it makes it true
        while (!names.isEmpty()) {
            System.out.println("The name is " + names.remove(0));
        }

        System.out.println("While loop is now finished because isEmpty is " + names.isEmpty());
    }

    public void forLoopExample() {

        System.out.println("For Loops are good when an index is needed");

        List<String> names = Arrays.asList("Gunner", "Jared", "Thomas");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(String.format("The name at index %s is %s", i, names.get(i)));
        }

        System.out.println("For loop always maintains items in list, number of names in list is " + names.size());
    }

    public void forEachLoopExample() {
        System.out.println("For Each Loops are good if you need to simply process everything in list.");

        List<String> names = Arrays.asList("Gunner", "Jared", "Thomas");

        for (String name : names) {
            System.out.println("The name is " + name);
        }

        System.out.println("For each loop always maintains items in list without need for index to retrieve, number of names in list is " + names.size());
    }

    public void doWhileLoopExample() {

        System.out.println("Do While is good for conditional processing if you have to run the block at least once no matter what.");
        System.out.println("Same as while loop, except the condition is evaluated after processing");

        List<String> names = new ArrayList<>();

        do {

            System.out.println("The list is empty but still ran code block, this loop is very rarely used and leads to confusion");

        } while (!names.isEmpty());


    }

    public void forEachLambdaExample() {

        System.out.println("For each lambda are java 8's fancy way of doing a for each loop.");

        List<String> names = Arrays.asList("Gunner", "Jared", "Thomas");

        //Fancy one liner
        names.forEach(name -> System.out.println("The name is " + name));

        System.out.println("Note this operates exactly as for each loop but is one line.");
    }

}
