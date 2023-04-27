package org.example;

public class ThreadCallingType1 {
    class PrimeThread extends Thread {
        long minPrime;
        PrimeThread(long minPrime) {
            this.minPrime = minPrime;
        }

        public void run() {
            // compute primes larger than minPrime
            System.out.println("working");
        }
    }
    public static void main(String[] args) {
        ThreadCallingType1 t = new ThreadCallingType1();
        PrimeThread p = t.new PrimeThread(143);
        p.start();
    }
}


