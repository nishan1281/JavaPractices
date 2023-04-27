package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(8));
    }
    public static int factorial(int n) {

        //base case
        if (n == 0||n==1){
            return 1;
        }
        //recursive case
        else {
            return n*factorial(n-1);
        }
    }
}