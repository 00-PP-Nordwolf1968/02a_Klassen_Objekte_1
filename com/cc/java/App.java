package com.cc.java;

public class App {
    
    public static void main(String[] args) {

             /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
       
        Cat cat1 = new Cat();
     

        cat1.firstName = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;


        output(cat1.firstName);
        output(cat1.furColor);

        // Umwandlung int in String --> Typkonvertierung
        output(Integer.toString(cat1.age));
        // output(String.valueOf(cat1.age));        // zweite Möglichgkeit Typkonvertierung


        output("------------------------------------------");

        Cat cat2 = new Cat();
     
        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.firstName);
        output(cat2.furColor);
        output(String.valueOf(cat1.age));
            
        }

        public static void output(String outputData) {
            System.out.println(outputData);
        }

    }

   


