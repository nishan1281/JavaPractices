package org.example;

public class Main {
    public static void main(String[] args) {
        FactorialCal task = new FactorialCal(5);
        task.factorialCalculation(new CallBack() {
            @Override
            public void onComplete() {
                System.out.println("Task completed");
            }
        });
    }
}