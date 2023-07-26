package com.cc.java;

public class Cat {
    
// this --> Instanzvariable

    public void tellYourAdress() {
         System.out.println("Blick von innen : " + this);
    }

public void testObj() {
    System.out.println("Gruß aus dem Objekt" + this);
}
public static void testClass() {
    System.out.println("Gruß aus der Klasse");
    
}
}
