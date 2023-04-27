package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //given a list of integer (1,2,4,6,3,45,23,45,91,74,22,23,21). Find out the count, sum, even and odd numbers?
        int[] numbers = {1,2,4,6,3,45,23,45,91,74,22,23,21};

        //count
        System.out.println(numbers.length);

        //make a list
//        List<Integer> numbersList = new ArrayList<>();
//        for(int i:numbers){
//            numbersList.add(i);
//        }
//        System.out.println(numbersList);

        List<Integer> numbersList = Arrays.stream(numbers)
                                            .boxed()
                                            .collect(Collectors.toList());

        System.out.println(numbersList);


        //sum by regular method
        int sum = 0;
        for(Integer i:numbers){
            sum +=i;
        }
        System.out.println("sum by regular method:" + sum);

        //sum by streaming from List API
        int sumByStream = numbersList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum by streaming from List API:" + sumByStream);

        //sum by streaming from array
        int sumByArrayStream = Arrays.stream(numbers).sum();
        System.out.println("sum by steaming from arrays:"+sumByArrayStream);

        //finding the even numbers by array of streams
        int[] evenNumbers = Arrays.stream(numbers).filter(n->n%2==0).toArray();
        System.out.println("Even number by streams of arrays: "+Arrays.toString(evenNumbers));

        //toString required as toArray() converts the stream of int numbers to array and relocate in a new memory location
        //so if we try to print evenNumbers, it will show the memory location. But if you use Arrays.toString, it will
        //show the arrays in memory.

        //finding the even numbers by list of streams
        List<Integer> evenNumbersByStream = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even numbers by stream of lists:" + evenNumbersByStream);

        //sum of odd numbers by list of streams
        int sumOfOddNumbersByStream = numbersList.stream().filter(n->n%2==1).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of odd numbers by stream of lists:" + sumOfOddNumbersByStream);




    }
}