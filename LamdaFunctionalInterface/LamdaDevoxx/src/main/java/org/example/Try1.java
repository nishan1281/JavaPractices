package org.example;

public class Try1 {
    public static void main(String[] args) {
        //first version
//        Thread  th = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("another thread");
//            }
//        });

        //Lambda version

        Thread th = new Thread(()-> System.out.println("another thread"));
        th.start();

        System.out.println("main thread");


    }
}