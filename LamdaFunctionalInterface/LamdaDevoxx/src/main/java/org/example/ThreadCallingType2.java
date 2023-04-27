package org.example;

public class ThreadCallingType2 {
    class PrimeRun implements Runnable {
        long minPrime;
        PrimeRun(long minPrime) {
            this.minPrime = minPrime;
        }

        public void run() {
            // compute primes larger than minPrime
            System.out.println("working");
        }
    }

    public static void main(String[] args) {
        ThreadCallingType2 t = new ThreadCallingType2();
        PrimeRun p = t.new PrimeRun(143);
        new Thread(p).start();
    }
}


