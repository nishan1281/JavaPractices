package org.example;

public class Main {
    public static void main(String[] args) {
//        printThings(new Cat());
//        Cat trialCat1 = new Cat();
        Printable trial1= (s, t) -> {
            System.out.println("hello"+s+t);
            return  "";
        };


        printThings(trial1);


    }

        static String printThings(Printable anything) {
        return anything.print ("n", "t");

    }
}