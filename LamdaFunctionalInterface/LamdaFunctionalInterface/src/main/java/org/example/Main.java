package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {

    
    public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            int sum = numbers.stream() // create a stream of the numbers
                    .filter(n -> n % 2 == 0) // filter out the odd numbers
                    .mapToInt(Integer::intValue) // convert to primitive int
                    .sum(); // calculate the sum

            System.out.println("Sum of even numbers: " + sum);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);



            myTask tasks = new myTask();
            tasks.doTask(new CallBack.callback() {
                @Override
                public void onComplete() {
                    System.out.println("second task is completed");
                }
            });

    }

}