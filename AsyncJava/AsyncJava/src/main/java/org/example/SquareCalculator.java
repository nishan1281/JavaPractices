package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
    // Create a new single-threaded executor
    private ExecutorService executor = Executors.newSingleThreadExecutor();
//    private ExecutorService executor = Executors.newFixedThreadPool(2);
    // Define a method to calculate the square of an integer asynchronously
    public Future<Integer> calculate (Integer input){

        // Submit a new task to the executor. Here lambda used.
        // in lambda Callable interface and call() used.
        //	call() Computes a result, or throws an exception if unable to do so.
        return executor.submit(()->{
            Thread.sleep(2000); //delay to simulate the programme

            // Calculate the square of the input value and return it
            return input*input;
        });

    }

    public void shutdown() {
        executor.shutdown();
    }
}

