package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung mit Custom Constructor
       
        Cat cat1 = new Cat("Grizabella", "white", 29);
     

        // Ausgabe
        output(cat1.tellYourName());
        output(cat1.furColor);

        // Umwandlung int in String --> Typkonvertierung
        
        output(Integer.toString(cat1.age));
        // output(String.valueOf(cat1.age));        // zweite Möglichgkeit Typkonvertierung


        output("------------------------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
  

        output(cat2.tellYourName());
        output(cat2.furColor);
        output(String.valueOf(cat1.age));
            
        }

        public static void output(String outputData) {
            System.out.println(outputData);
        }

    }

   


