package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    record Person (String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("lucy", "Van pet"),  // it has no major difference with new person. Just confirming the class name.
                new Person("john", "Doe"),
                new Person("jane", "Doe")));
    }
}