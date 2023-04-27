package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListLambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList (1,2,3,4,5,6,7,8,9,10);

        //external Iterators a1. sequential iteration
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //external Iterators short of a1. sequential iteration

        for (int i : numbers) {
            System.out.println(i);
        }

        //internal iterators : calling function on numbers. hidden iteration by consumer interface

        numbers.forEach(new Consumer<Integer>() {
            public void accept (Integer value){
                System.out.println(value);
            }
        });

        //lambda of consumer interface. But here not need to import the Consumer interface

        numbers.forEach((Integer value)->System.out.println(value));

        // reducing Integer, cause lambda can infer type information.
        numbers.forEach((Value)->System.out.println(Value));

        //parenthesis is optional for one parameter
        numbers.forEach(Value->System.out.println(Value));

        //method reference syntax where receive and pass the value only
        numbers.forEach(System.out::println);

        //using string

        numbers.stream()
                .map(e->String.valueOf(e))
                .forEach(System.out::println);

        //reduced map to function reference syntax
        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        //to concat all the numbers
        System.out.println(
        numbers.stream()
                .map(String::valueOf)
                .reduce("", String::concat));





    }
}
