package org.example;

public class Cat implements Printable{
   public String name;
   public int age;

   public Cat (){
   }

    @Override
    public String print(String s, String t) {
        System.out.println("mewaw"+s +t);
        return t;
    }
}
