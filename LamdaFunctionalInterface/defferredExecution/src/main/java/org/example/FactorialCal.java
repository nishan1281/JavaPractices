package org.example;

public class FactorialCal {
    private int count;

    public FactorialCal (int count) {
        this.count = count;
    }

    public void factorialCalculation(CallBack callback){
        System.out.println(factorial(count));
        callback.onComplete();
    }

    private int factorial(int n) {
        if(n==0||n==1){
            return 1;
        }
        else {
            return n *factorial(n-1);
        }
    }
}
