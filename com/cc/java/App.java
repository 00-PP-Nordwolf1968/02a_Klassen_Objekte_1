package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung mit Custom Constructor
       
        Cat cat1 = new Cat("Grizabella", "white", 29);
     

        // Ausgabe über Getter
        output(cat1.getFirstName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));




        output("------------------------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
  
        // Ausgabe über Getter
        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));
       
            
        }

        public static void output(String outputData) {
            System.out.println(outputData);
        }

    }

   


